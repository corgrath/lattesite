package lattesite.services;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;

public class StaticWebServerService implements StaticWebServerServiceInterface {

    private final LogService logService;
    private final String publicFolder;

    private HttpServer server;

    public StaticWebServerService(LogService logService) {
        this.logService = logService;
        this.publicFolder = "public/";
    }

    @Override
    public void serve(int port) throws Exception {
        try {
            this.server = HttpServer.create(new InetSocketAddress(port), 0);
            this.server.createContext("/", new StaticFileHandler(publicFolder));
            this.server.setExecutor(null); // creates a default executor
            this.server.start();

            this.logService.log("Static Server started on http://localhost:" + port + "/");
        } catch (IOException exception) {
            throw new Exception(exception);
        }
    }

    static class StaticFileHandler implements HttpHandler {
        private final String publicFolder;

        public StaticFileHandler(String publicFolder) {
            this.publicFolder = publicFolder;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String requestPath = exchange.getRequestURI().getPath();
            if (requestPath.equals("/")) {
                requestPath = "/index.html"; // Serve index.html by default
            }

            File file = new File(publicFolder + requestPath).getCanonicalFile();

            // Prevent path traversal attacks
            if (!file.getPath().startsWith(new File(publicFolder).getCanonicalPath())) {
                send404(exchange);
                return;
            }

            if (file.exists() && file.isFile()) {
                String contentType = Files.probeContentType(file.toPath());
                if (contentType == null) {
                    contentType = "application/octet-stream";
                }

                exchange.getResponseHeaders().set("Content-Type", contentType);
                exchange.sendResponseHeaders(200, file.length());

                try (OutputStream os = exchange.getResponseBody(); FileInputStream fis = new FileInputStream(file)) {
                    byte[] buffer = new byte[8192];
                    int length;
                    while ((length = fis.read(buffer)) != -1) {
                        os.write(buffer, 0, length);
                    }
                }
            } else {
                send404(exchange);
            }
        }

        private void send404(HttpExchange exchange) throws IOException {
            String response = "404 Not Found";
            exchange.sendResponseHeaders(404, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }

}