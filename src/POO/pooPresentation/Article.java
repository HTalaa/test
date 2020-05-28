package POO.pooPresentation;

public abstract class Article{
    private double prix;
    private String marque;
    private String nom;
    private boolean neuf = true;
    //final double SOLDE=20;

    public Article(double prix, String marque, String nom) {
        this.prix = prix;
        this.marque = marque;
        this.nom = nom;
    }

    protected double getPrix() {
        return prix;
    }

    protected void setPrix(double prix) {
        if(prix >= 0){
            this.prix = prix;
        }
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(!nom.isBlank()){
            this.nom = nom;
        }
    }

    public boolean isNeuf() {
        return neuf;
    }

    public void setNeuf(boolean neuf) {
        this.neuf = neuf;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
       sb.append(" prix = ").append(prix)
                 .append(" marque = ").append(this.getMarque())
                 .append(" nom =").append(this.getNom())
                .append(" neuf = ").append(this.isNeuf());

        return sb.toString();

    }

    public abstract void solder(double reduction);
}
