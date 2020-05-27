package POO.ExoCollectionMedia;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Media> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        l2.add("titre1");
        l2.add("titre2");
        l2.add("titre3");
        Media m1=new LivrePapier("java how to program","hamid",10,20,"resumé resumé resumé resumé resumé resumé ",500);
        Media m2=new LivrePapier("java how to program","hamid",10,20,"resumé resumé resumé resumé resumé resumé ",500);
        Media m3=new LivreAudio("java audio","alex",30,10,"resomé audio","hamidoo");
        Media m4=new BD("BD tom et jerry","john",40,"jack","Antoine");
        Media m5=new Album("album neuf","lucie",23,l2);

        l1.add(m1);
        l1.add(m2);
        l1.add(m3);
        l1.add(m4);

        Utilisateurs u1=new Utilisateurs("Hamid",100,l1);

        u1.getAllPossesions();
        System.out.println(u1.getSold());
        u1.vendre(m1,true);
        u1.getAllPossesions();
        System.out.println(u1.getSold());
        u1.lire(m2);
        u1.lire(m3);
        u1.ecouter(m3);
        u1.acheter(m5);
        System.out.println(u1.getSold());
    }
}
