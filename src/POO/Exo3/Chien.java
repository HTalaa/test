package POO.Exo3;

public class Chien {
    private String nom;
    private String dateNaiss;
    private double taille;
    private String race;
    public Chien(String nom,String dateNaiss,double taille){
        this.nom=nom;
        this.dateNaiss=dateNaiss;
        this.taille=taille;

    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void aboyer(){
        System.out.println(this.nom+" aboie");
    }

}
