package POO.Exo4;

public class VoitureAmphibie extends Voiture implements Navigant{
    private String couleur;

    public VoitureAmphibie(String modele, String couleur) {
        super(modele);
        this.couleur = couleur;
    }

    @Override
    public void naviger() {
        System.out.println("naviger la Voiture Amphibie");
    }
}
