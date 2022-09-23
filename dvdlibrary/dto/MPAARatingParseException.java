package dvdlibrary.dto;

public class MPAARatingParseException extends Exception {

    private static String getExceptionMessage(String mpaaRating) {
        return "Unexpected MPAA rating value: " + mpaaRating;
    }

    public MPAARatingParseException(String mpaaRating) {
        super(getExceptionMessage(mpaaRating));
    }

    public MPAARatingParseException(String mpaaRating, Throwable cause) {
        super(getExceptionMessage(mpaaRating), cause);
    }
}
