package POO.pooPresentation;

public final class Ceinture extends Accessoire implements Ajustable{
    int diametre = 0;

    public Ceinture(double prix, String marque, String nom, String description, boolean tailleChangeable, int diametre) {
        super(prix, marque, nom, description, tailleChangeable);
        this.setDiametre(diametre);
    }

    public int getDiametre() {
        return diametre;
    }

    public void setDiametre(int diametre) {
        if(diametre >= 0){
            this.diametre = diametre;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
            .append("le diamètre de la ceinture : ")
                .append(this.getDiametre())
                .append("cm");

        return sb.toString();
    }



    @Override
    public void ajuster() {
        System.out.println("la ceinture " + this.getNom() + " est ajusté");
    }
}
