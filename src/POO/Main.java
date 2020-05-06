package POO;

public class Main {
    public static void main(String[] args) {
        Personne p1=new Personne("Hamid","23-04-1988");
        Chien c1=new Chien("dani","01-01-2015");
        c1.setProprietaire(p1);
        p1.caresser(c1);
        p1.saluer();
        c1.aboyer();
    }
}
