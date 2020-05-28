package POO.pooPresentation;

public abstract class Accessoire extends Article{
    String description;
    boolean tailleChangeable = false;

    public Accessoire(double prix, String marque, String nom, String description, boolean tailleChangeable) {
        super(prix, marque, nom);
        this.setDescription(description);
        this.setTailleChangeable(tailleChangeable);
    }

    public Accessoire(double prix, String marque, String nom, String description) {
        super(prix, marque, nom);
        this.setDescription(description);
    }

    public boolean isTailleChangeable() {
        return tailleChangeable;
    }

    public void setTailleChangeable(boolean tailleChangeable) {
        this.tailleChangeable = tailleChangeable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append(this.getNom())
                .append(" - ")
                .append(this.getMarque())
                .append(" - ")
                .append(this.getDescription())
                .append(" - ")
                .append(this.getPrix())
                .append(" - ");

         return sb.toString();
    }

    public void solder(double reduction) {
        if(reduction < this.getPrix() && reduction>0){
            System.out.println("la reduction est de "+reduction+"Euro");
            setPrix(getPrix()-reduction);
        }
        else
            System.out.println("la reduction doit être inferieure au prix de l'objet");

    }
}
