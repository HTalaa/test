package POO.Bibliotheque;




public abstract class Media {
    private String id;
    private String title;
    private String authorName;
    private double price;
    private MediaType type;



    public Media(String id, String title, String authorName, double price, MediaType type) {
        boolean titleLengthOk = (title.length() >= 1 && title.length() <= 500);
        boolean authorNameLengthOK = (authorName.length() >= 1 && authorName.length() <= 300);
        boolean priceValueOK = (price>0 && price<= 300);
        boolean isNotBanned=true;
        if (!titleLengthOk || !authorNameLengthOK || !priceValueOK || !isNotBanned ){
            throw new InvalidMediaException(titleLengthOk, authorNameLengthOK, priceValueOK, isNotBanned );
        }
        this.setId(id);
        this.setTitle(title);
        this.setAuthorName(authorName);
        this.setPrice(price);
        this.setType(type);
    }

    public Media(String title, String authorName, double price) {
        this.setTitle(title);
        this.setAuthorName(authorName);
        this.setPrice(price);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        if(!title.isBlank())
            this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    private void setAuthorName(String authorName) {
        if(!authorName.isBlank())
            this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if(price >5)
            this.price = price;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }

    public String toString(){
        StringBuilder str=new StringBuilder();
        str.append("id: "+getId())
                .append(" title: "+ getTitle())
                .append(" author name:"+ getAuthorName())
                .append(" price: "+ getPrice())
                .append(" type : "+getType());
        return str.toString();
    }


}
