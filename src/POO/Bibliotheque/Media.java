package POO.Bibliotheque;


public class Media {
    private String titre;
    private String nomAuteur;
    private double prix;
    private MediaType type;

    public Media(String titre, String nomAuteur, double prix, MediaType type) {
        this.setTitre(titre);
        this.setNomAuteur(nomAuteur);
        this.setPrix(prix);
        this.setType(type);
    }

    public Media(String titre, String nomAuteur, double prix) {
        this.setTitre(titre);
        this.setNomAuteur(nomAuteur);
        this.setPrix(prix);
    }

    public String getTitre() {
        return titre;
    }

    private void setTitre(String titre) {
        if(!titre.isBlank())
            this.titre = titre;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    private void setNomAuteur(String nomAuteur) {
        if(!nomAuteur.isBlank())
            this.nomAuteur = nomAuteur;
    }

    public double getPrix() {
        return prix;
    }

    private void setPrix(double prix) {
        if(prix>5)
            this.prix = prix;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }
    public void getAll(){
        System.out.println("titre: "+getTitre()+" nom de auteur:"+getNomAuteur()+" prix: "+getPrix());
    }
}
