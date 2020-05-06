package POO;

public class Chien {
    String nom;
    String dateNaiss;
    Personne proprietaire;
    public Chien(String nom,String dateNaiss)
    {
           this.nom=nom;
           this.dateNaiss=dateNaiss;
    }
    public void setProprietaire(Personne proprietaire){
        this.proprietaire=proprietaire;
    }
    public void aboyer(){
        System.out.println(nom+" aboie sur "+proprietaire.nom);
    }
}
