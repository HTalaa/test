package POO.ExoCollectionMedia;

public class LivrePapier extends Livre implements LectureInterface {
    private int noPage;

    public int getNoPage() {
        return noPage;
    }

    public LivrePapier(String titre, String nomAuteur, double prix, int noDeChapitre, String resume, int noPage) {
        super(titre, nomAuteur, prix, noDeChapitre, resume);
        this.setNoPage(noPage);
        setType(MediaType.LivrePapier);
    }

    @Override
    public void raconter() {
        System.out.println("le nombre des pages "+getNoPage()+"\nle resumé est: "+getResume());
    }

    @Override
    public void lire() {
        System.out.println("lire lire livre papier");
    }

    public void setNoPage(int noPage) {
        if(noPage>=0)
            this.noPage = noPage;
    }
    public void getAll(){
        super.getAll();
        System.out.println("type: "+getType()+" nombre de pages: "+getNoPage());
    }
}
