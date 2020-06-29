package POO.PresentationLibrary;

public class Book  extends Media {
    private int pageNumber;


    public Book(String title, String authorName, float price, int pageNumber) throws Exception{
        super(title, authorName, price);
        this.setPageNumber(pageNumber);
        this.setId("B-");
    }

    public Book(String id, String title, String authorName, float price, int pageNumber) throws Exception{
        super(title, authorName, price);
        this.setPageNumber(pageNumber);
        this.setId(id);
    }


    // Getters and Setters
    public int getPageNumber() {
        return pageNumber;
    }


    //nombre de page non négatif.
    private void setPageNumber( int pageNumber) throws Exception {
        final String ANSI_RESET = "\u001B[0m",  ANSI_PURPLE = "\u001B[35m";
        if (pageNumber<0 ){
            throw new Exception(ANSI_PURPLE+"Attention! Le nombre de pages ne peut pas être négatif."+ANSI_RESET+"\n");
        } else{
            this.pageNumber = pageNumber;
        }
    }


    @Override
    public String toString() {
        StringBuffer sBuffer = new StringBuffer(super.toString());
        sBuffer.append("nombre de pages : " + this.getPageNumber()+ "\n");
        return sBuffer.toString();
    }

}