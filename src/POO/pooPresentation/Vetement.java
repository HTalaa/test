package POO.pooPresentation;

public final class Vetement extends Article implements Ajustable{
    String couleur;

    public Vetement(double prix, String marque, String nom, String couleur) {
        super(prix, marque, nom);

        this.setCouleur(couleur);
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public void ajuster() {
        System.out.println("le vêtement " + this.getNom() + " est ajusté");
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(super.toString())
                .append("couleur =").append(this.getCouleur());
        return sb.toString();

    }

    @Override
    public void solder(double reduction) {
        if(reduction < 90 && reduction>0) {
            System.out.println("La reduction est de " + reduction + "%");
            setPrix(getPrix() * (100 - reduction) / 100);
        }
        else
            System.out.println("la reduction doit être comprise entre 0 et 90");
    }
}
