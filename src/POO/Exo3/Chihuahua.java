package POO.Exo3;

public class Chihuahua extends Chien {
    private int decible;
    public Chihuahua(String nom,String dateNaiss,double taille,String race,int decible){
        super(nom, dateNaiss, taille);
        this.decible=decible;
        super.setRace(race);
    }
    public Chihuahua(String nom,double taille,String race,int decible){
        super(nom,"01-01-0001",taille);
        super.setRace(race);
        this.decible=decible;

    }
    public void aboyer(){
        System.out.println(nom+" aboie à "+decible +" decible");
    }
    public void aboyer(String nom){
        System.out.println(super.nom+" aboie à "+decible +" decible sur "+nom);
    }

}
