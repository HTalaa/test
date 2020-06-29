package POO.PresentationLibrary;

public class InvalidMediaException  extends RuntimeException{

    private final boolean titleLengthValid;
    private final boolean authorLengthValid;
    private final boolean authorNotBanned;
    private final boolean priceValid;


    public InvalidMediaException(boolean titleLength, boolean authorLength, boolean authorBan, boolean priceMediaValidator ) {
        this.titleLengthValid = titleLength;
        this.authorLengthValid = authorLength;
        this.authorNotBanned=authorBan;
        this.priceValid=priceMediaValidator;
    }

    @Override
    public String getMessage() {
        final String ANSI_RESET = "\u001B[0m",  ANSI_PURPLE = "\u001B[35m";

        String message="";
        if(!titleLengthValid){
            message=message+ANSI_PURPLE+"Attention! Titre de Media ne peut pas être vide et > 500 symbols"+ANSI_RESET+"\n";
        }
        if(!authorLengthValid){
            message=message+ANSI_PURPLE+"Attention! Auteur de Media ne peut pas être vide et > 300 symbols"+ANSI_RESET+"\n";
        }
        if(!authorNotBanned){
            message=message+ANSI_PURPLE+ "Attention! Auteur est banni"+ANSI_RESET+"\n";
        }
        if(!priceValid){
            message=message+ANSI_PURPLE+"Attention! Prix de Media ne peut pas être suppérieur à 300 euro"+ANSI_RESET+"\n";
        }

        if (message.equals("")) {return super.getMessage();}
        return message;
    }

    public boolean isTitleLengthValid() {
        return titleLengthValid;
    }

    public boolean isAuthorLengthValid() {
        return authorLengthValid;
    }

    public boolean isPriceValid() {
        return priceValid;
    }

    public boolean isNotBannedAuthor() {
        return authorNotBanned;
    }


}
