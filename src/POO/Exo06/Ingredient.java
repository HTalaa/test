package POO.Exo06;

public class Ingredient {
    private String nom="defaut";
    private int qtt;

    public Ingredient(String nom, int qtt) {
        //this.nom = nom;
        //this.qtt = qtt;
        this.setNom(nom);
        this.setQtt(qtt);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(!nom.isBlank())
            this.nom = nom;
        else
            System.out.println("le nom n'est pas valid");
    }

    public int getQtt() {
        return qtt;
    }

    public void setQtt(int qtt) {
        if(qtt >=0)
            this.qtt = qtt;
        else
            System.out.println("le quantitie n'est pas valid");
    }
}
