package POO.Bibliotheque;

public class Book extends Media {
    private int pageNumber;


    public Book(String title, String authorName, double price, int pageNumber) throws Exception{
        super(title, authorName, price);
        this.setPageNumber(pageNumber);
        //this.setId("B-" + countId);
    }

    public Book(String id,String title, String authorName, double price, int pageNumber) throws Exception{
        super(id,title, authorName, price,MediaType.Book);
        this.setPageNumber(pageNumber) ;
        //this.setPageNumber(this.setId("B-" + countId);
    }
    // Getters and Setters
    public int getPageNumber() {
        return pageNumber;
    }


    //nombre de page non négatif.
    private void setPageNumber( int pageNumber) throws Exception{
        if (pageNumber<0 ){
            throw new Exception("Check page number!");
        } else{
            this.pageNumber = pageNumber;
        }
    }


    @Override
    public String toString() {
        StringBuffer sBuffer = new StringBuffer(super.toString());
        sBuffer.append("nombre de pages : " + this.getPageNumber());
        return sBuffer.toString();
    }

}
