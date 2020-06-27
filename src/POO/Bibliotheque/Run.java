package POO.Bibliotheque;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Media media = new Media("my media","Hamid Talaa" ,44.29,MediaType.Album);
        Media media1 = new Media("new media", "joseph",45.78,MediaType.BD);
        MediaFileManager fm = new MediaFileManager();
        fm.add(media);
        fm.add(media1);
        ArrayList<Media> mediaArrayList=fm.getAll();
        for (Media m:mediaArrayList) {
            m.getAll();
        }
    }
}
