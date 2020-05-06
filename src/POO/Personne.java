package POO;

public class Personne {
    String nom;
    String dateNaiss;
    public Personne(String nom,String dateNaiss){
        this.nom=nom;
        this.dateNaiss=dateNaiss;
    }
    public void caresser(Chien c){
        System.out.println(nom+" caresse "+c.nom);
    }
    public void saluer(){
        System.out.println("Salut je m'appelle "+nom);
    }
}
