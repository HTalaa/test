package POO.Bibliotheque;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        ArrayList<String> nameTitles=new ArrayList<>();
        nameTitles.add("title1");
        nameTitles.add("title2");
        nameTitles.add("title3");
        //Media media = new Media("A-1","my media","Hamid Talaa" ,44.29,MediaType.Album);
        Media media1 = new Album("B-1","new media", "joseph",45.78,nameTitles);
        MediaFileManager fm = new MediaFileManager();
        //fm.add(media);
        fm.add(media1);
        ArrayList<Media> mediaArrayList=fm.getAll();
        for (Media m:mediaArrayList) {
            System.out.println(m.getAll().toString());
        }
    }
}
