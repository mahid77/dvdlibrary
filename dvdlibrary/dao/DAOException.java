package dvdlibrary.dao;

public class DAOException extends Exception {

    public DAOException(String error) {
        super(error);
    }

    public DAOException(String error, Throwable cause) {
        super(error, cause);
    }
}
