package POO.ExoCollectionMedia;

public abstract class Livre extends Media{
    private int noDeChapitre;
    private String resume;

    public Livre(String titre, String nom, double prix, int noDeChapitre, String resume) {
        super(titre, nom, prix);
        this.setNoDeChapitre(noDeChapitre);
        this.setResume(resume);
    }
    public abstract void raconter();
    public int getNoDeChapitre() {
        return noDeChapitre;
    }

    private void setNoDeChapitre(int noDeChapitre) {
        if(noDeChapitre>0)
            this.noDeChapitre = noDeChapitre;
    }

    public String getResume() {
        return resume;
    }

    private void setResume(String resume) {
        this.resume = resume;
    }
    public void getAll(){
        super.getAll();
        System.out.println(" nombre de chapitres: "+getNoDeChapitre()+" resumé: "+getResume());
    }
}
