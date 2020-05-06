package POO.Exo2;

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
