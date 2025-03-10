package lattesite.services;

import lattesite.exceptions.LatteSiteException;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileService {

    private final LogService logService;

    public FileService(LogService logService) {
        this.logService = logService;
    }

    /**
     * Writes a file on disk with the given string using UTF-8.
     *
     * @param file     - The file destination on disk
     * @param contents - The string data
     * @throws LatteSiteException - If any problems occur
     */
    public void writeFile(String file, String contents) throws LatteSiteException {
        this.logService.log("Writing file \"" + file + "\".");
        try {
            FileUtils.writeStringToFile(new File(file), contents, StandardCharsets.UTF_8);
        } catch (IOException exception) {
            throw new LatteSiteException(exception);
        }
    }

    public void copyDirectory(String from, String to) throws LatteSiteException {
        this.logService.log("Copying contents from \"" + from + "\" to \"" + to + "\".");
        try {
            FileUtils.copyDirectory(new File(from), new File(to));
        } catch (IOException exception) {
            throw new LatteSiteException(exception);
        }
    }

    public void deleteDirectory(String folder) throws LatteSiteException {
        this.logService.log("Deleting folder  \"" + folder + "\".");
        try {
            FileUtils.deleteDirectory(new File(folder));
        } catch (IOException exception) {
            throw new LatteSiteException(exception);
        }
    }

}
