package POO.PresentationLibrary;

public abstract class Media {
    private String title;
    private String authorName;
    private float price;
    protected String id;
    //static int countId=0;
    public final String ANSI_RESET = "\u001B[0m", ANSI_CYAN = "\u001B[36m", ANSI_RED = "\u001B[31m", ANSI_GREEN = "\u001B[92m", ANSI_BLUE = "\u001B[34m", ANSI_PURPLE = "\u001B[35m", ANSI_YELLOW = "\u001B[33m", ANSI_BOLD = "\u001B[1m", ITALIC= "\u001B[3m";;


    // Constructor
    public Media(String title, String authorName, float price){
        boolean titleLengthOk = (title.length() >= 1 && title.length() <= 500 && title!=null  && !title.isEmpty());
        boolean authorNameLengthOK = (authorName.length() >= 1 && authorName.length() <= 300 && authorName!=null  && !authorName.isEmpty() );
        boolean priceValueOK = (price>0 && price<= 300);
        boolean isNotBanned=true;
        if (!titleLengthOk || !authorNameLengthOK || !priceValueOK || !isNotBanned ){
            throw new InvalidMediaException(titleLengthOk, authorNameLengthOK, isNotBanned,priceValueOK );
        }
        this.setTitle(title);
        this.setAuthorName(authorName);
        this.setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    private void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    private void setPrice(float price) {
        this.price=price;
    }

    public float getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        //String idPattern = "[BAD]-[0-9]{10}";
        this.id=id;
    }


    @Override
    public String toString() {
        StringBuffer sBuffer = new StringBuffer("Info : - " +this.getClass().getSimpleName()+" - \n");
        sBuffer.append("nom de l’auteur    : " + this.getAuthorName()+ "\n");
        sBuffer.append("titre              : " + this.getTitle()+ "\n");
        sBuffer.append("prix               : " + this.getPrice()+ "\n");
        return sBuffer.toString();
    }


}
