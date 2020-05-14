package POO.Exo4;

public class Voiture extends Vehicul implements Roulant{
    private String modele;

    public Voiture(String modele) {
        this.modele = modele;
    }

    @Override
    public void seDeplacer() {
        System.out.println("se deplacer voiture");
    }

    @Override
    public void rouler() {
        System.out.println("rouler voiture");
    }
}
