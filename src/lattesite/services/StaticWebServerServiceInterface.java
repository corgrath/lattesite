package lattesite.services;

import lattesite.exceptions.LatteSiteException;

public interface StaticWebServerServiceInterface {

    void serve(int port) throws LatteSiteException;

}