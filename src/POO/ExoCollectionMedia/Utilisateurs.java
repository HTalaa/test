package POO.ExoCollectionMedia;

import java.util.ArrayList;
import java.util.List;

public class Utilisateurs {
    private String nom;
    private double sold;
    private List<Media> mediaList=new ArrayList<>();

    public Utilisateurs(String nom, double sold, List<Media> mediaList) {
        this.setNom(nom);
        this.setSold(sold);
        this.mediaList = mediaList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (!nom.isBlank())
            this.nom = nom;
    }

    public double getSold() {
        return sold;
    }

    private void setSold(double sold) {
        if (sold>0)
            this.sold = sold;
    }

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }
    public void addMedia(Media m){
        mediaList.add(m);
    }
    public void acheter(Media m){
        if(sold>=m.getPrix()){
            sold-=m.getPrix();
            addMedia(m);
        }
        else {
            System.out.println("Vous n'avez pas assez d'argent");
        }
    }
    public void vendre(Media m,Boolean p){
        if(p){
            sold+=m.getPrix();

        }
        else {
            sold+=m.getPrix()/2;
        }
        mediaList.remove(m);
    }
    public void recuperer(int index){
        System.out.println("nom: "+mediaList.get(index).getNomAuteur()+" titre: "+mediaList.get(index).getTitre()+" prix: "+mediaList.get(index).getPrix()+" type: "+mediaList.get(index).getType());

    }

    public void lire(Media m){
            if(m.getType().equals(MediaType.LivrePapier)){

                ((LivrePapier) m).lire();
            }
            else if(m.getType().equals(MediaType.BD)){

                ((BD) m).lire();
            }
            else{
                System.out.println("Vous ne pouvez pas lire cette media");
            }
    }
    public void ecouter(Media m){
        if(m.getType().equals(MediaType.Album)){

            ((Album) m).ecouter();
        }
        else if(m.getType().equals(MediaType.LivreAudio)){

            ((LivreAudio) m).ecouter();
        }
        else{
            System.out.println("Vous ne pouvez pas ecouter cette media");
        }
    }
    public void getAllPossesions(){
        for (Media m:mediaList) {
            m.getAll();

        }
    }
}
