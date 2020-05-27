package POO.ExoCollectionMedia;

import java.util.ArrayList;
import java.util.List;

public class Album extends Media implements AudioInterface{
    private List<String> nomDeTitres=new ArrayList<>();

    public Album(String titre, String nomAuteur, double prix) {
        super(titre, nomAuteur, prix);
        setType(MediaType.Album);
    }

    public Album(String titre, String nom, double prix, List<String> nomDeTitres) {
        super(titre, nom, prix);
        this.nomDeTitres = nomDeTitres;
        setType(MediaType.Album);
    }



    public  List<String> getNomDeTitres() {
        return nomDeTitres;
    }

    public  void setNomDeTitres(List<String> nomDeTitres) {
        this.nomDeTitres = nomDeTitres;
    }
    public void getAll(){
        super.getAll();
        System.out.println("type: "+getType());
    }

    @Override
    public void ecouter() {
        System.out.println("ecouter l'album");
    }
    /*
    public void addNomDeTitre(String nomDeTitre){
        nomDeTitres.add(nomDeTitre);
    }

 */
}
