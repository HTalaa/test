package POO.Bibliotheque;



import java.util.ArrayList;
import java.util.List;

public class Album extends Media {
    private ArrayList<String> listNameTitles =new ArrayList<>();

    /*public Album(String id,String title, String authorName, double price) {
        super(title, authorName, price);
        super.setType(MediaType.Album);
    }*/

    public Album(String id,String title, String authorName, double price, ArrayList<String> listNameTitles) {
        super(id,title, authorName, price,MediaType.Album);
        setListNameTitles(listNameTitles) ;

    }



    public  ArrayList<String> getListNameTitles() {
        return listNameTitles;
    }

    public  void setListNameTitles(ArrayList<String> listNameTitles) {
        this.listNameTitles = listNameTitles;
    }
    public StringBuilder getAll(){
        return super.getAll().append(" name list: "+getListNameTitles().toString());
    }


}
