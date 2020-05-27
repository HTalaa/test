package POO.ExoCollectionMedia;

public class LivreAudio extends Livre implements AudioInterface  {
    private String nomNarr;



    public LivreAudio(String titre, String nomAuteur, double prix, int noDeChapitre, String resume, String nomNarr) {
        super(titre, nomAuteur, prix, noDeChapitre, resume);
        this.setNomNarr(nomNarr);
        setType(MediaType.LivreAudio);
    }

    @Override
    public void raconter() {
        System.out.println("le resumé du livre audio est: "+getResume());

    }
    public String getNomNarr() {
        return nomNarr;
    }
    public void setNomNarr(String nomNarr) {
        if(!nomNarr.isBlank())
            this.nomNarr = nomNarr;
    }
    public void getAll(){
        super.getAll();
        System.out.println("type: "+getType()+" nom du narrateur: "+getNomNarr());
    }

    @Override
    public void ecouter() {
        System.out.println("Ecouter le livre audio");
    }
}
