package dvdlibrary.dto;

public class DVDDateParseException extends Exception {

    private static String getExceptionMessage(String movieTitle) {
        return "Error parsing an invalid DVD release date for: " + movieTitle;
    }

    public DVDDateParseException(String movieTitle) {
        super(getExceptionMessage(movieTitle));
    }

    public DVDDateParseException(String movieTitle, Throwable cause) {
        super(getExceptionMessage(movieTitle), cause);
    }
}
