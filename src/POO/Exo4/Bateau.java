package POO.Exo4;

public class Bateau extends Vehicul implements Navigant{
    private int puissanceMoteur;

    public Bateau(int puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }

    @Override
    public void seDeplacer() {
        System.out.println("se deplacer bateau");
    }

    @Override
    public void naviger() {
        System.out.println("naviger le bateau");
    }
}
