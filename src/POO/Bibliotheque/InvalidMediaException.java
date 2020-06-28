package POO.Bibliotheque;

public class InvalidMediaException extends RuntimeException {
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
        String message="";
        if(!titleLengthValid){
            message=message+"\n Titre de Media ne peut pas être vide et > 500 symbols";
        }
        if(!authorLengthValid){
            message=message+ "\n Auteur de Media ne peut pas être vide et > 300 symbols";
        }
        if(!authorNotBanned){
            message=message+ "\n Auteur est banni";
        }
        if(!priceValid){
            message=message+ "\n Prix de Media ne peut pas être suppérieur à 300 euro";
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
