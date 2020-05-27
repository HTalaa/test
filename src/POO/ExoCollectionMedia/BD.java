package POO.ExoCollectionMedia;

public class BD extends Media implements LectureInterface{
    private String nomDess;
    private String nomScen;

    public BD(String titre, String nomAuteur, double prix, String nomDess, String nomScen) {
        super(titre, nomAuteur, prix);
        this.setNomDess(nomDess);
        this.setNomScen(nomScen);
        setType(MediaType.BD);
    }

    public String getNomDess() {
        return nomDess;
    }

    public void setNomDess(String nomDess) {
        this.nomDess = nomDess;
    }

    public String getNomScen() {
        return nomScen;
    }

    public void setNomScen(String nomScen) {
        this.nomScen = nomScen;
    }

    @Override
    public void lire() {
        System.out.println("lire lire BandeDessinée");
    }
    public void getAll(){
        super.getAll();
        System.out.println("type: "+getType()+" nom du dessinateur: "+getNomDess()+"  nom du scénariste: "+getNomScen());
    }
}
