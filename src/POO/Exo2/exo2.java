package POO.Exo2;





public class Personne {
    private String nom;
    private String adresse;
    private String dateNaiss;
    private Chien chien;
    public Personne(String nom,String adresse,String dateNaiss,Chien chien){
        this.nom=nom;
        this.adresse=adresse;
        this.dateNaiss=dateNaiss;
        this.chien=chien;
    }
    public void setNom(String nom){
        if(nom.length()>=6){
            this.nom=nom;
        }
        else{
            System.out.println("le nom est plus que 5 lettre");
        }

    }
    public String getNom()
    {
        return this.nom;
    }
    public void setAdresse(String adresse){
        if(this.adresse.length()==0&& adresse.length()>0){
            this.adresse=adresse;
        }
        else
        {
            System.out.println("pas vide ,pas modifiable");
        }

    }
    public String getAdresse(){
        return this.adresse;
    }
    public  void  setChien(Chien chien){
        if(chien.nom.length()<8 && chien.race.compareTo("shiba")!=0){
            this.chien=chien;
        }
        else{
            System.out.println("desolé");
        }

    }
    public Chien getChien(){
        return this.chien;
    }
    public void caresser(Chien c){
        System.out.println(nom+" caresse "+c.nom);
    }
    public void saluer(){
        System.out.println("Salut je m'appelle "+nom);
    }
}

public class Chien {
    String nom;
    String race;

    public Chien(String nom,String race)
    {
        this.nom=nom;
        this.race=race;
    }

    public String getNom() {
        return nom;
    }

    public String getRace() {
        return race;
    }

    public void setNom(String nom) {
        if(!nom.contains(" "))
            this.nom = nom;
        else
            System.out.println("le nom ne peut pas contenir space");
    }

    public void setRace(String race) {
        if(this.race.length()==0)
            this.race = race;
        else
            System.out.println("ce n'est pas modifiable");
    }

}
