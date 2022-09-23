package io;

public class DataStoreException extends Exception {

    public DataStoreException(String error) {
        super(error);
    }

    public DataStoreException(String error, Throwable cause) {
        super(error, cause);
    }
}
