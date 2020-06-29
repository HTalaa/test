package POO.PresentationLibrary;

public class AuthorBannedException extends RuntimeException {
    private String author;

    public AuthorBannedException (String author){
        this.author = author;
    }

    public String getMessage() {
        final String ANSI_RESET = "\u001B[0m",  ANSI_PURPLE = "\u001B[35m";
        return ANSI_PURPLE+this.author+" est banni !"+ANSI_RESET;
    }
}
