package POO.PresentationLibrary;

public class BD extends Media {

    private String namePainter;

    public BD(String title, String authorName, float price, String namePainter) {
        super(title, authorName, price);
        this.setNamePainter(namePainter);
        this.setId("C-");
    }

    public String getNamePainter() {
        return namePainter;
    }

    public void setNamePainter(String namePainter) {
        this.namePainter = namePainter;
    }

    @Override
    public String toString() {
        StringBuffer sBuffer = new StringBuffer(super.toString());
        sBuffer.append("nombre de pages : " + this.getNamePainter()+ "\n");
        return sBuffer.toString();
    }
}
