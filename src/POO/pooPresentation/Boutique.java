package POO.pooPresentation;

import java.util.ArrayList;

public class Boutique {
    private String nom;
    ArrayList<Article> boutiqueArticles = new ArrayList<>();

    public Boutique(String nom) {
        this.setNom(nom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(!nom.isBlank()){
            this.nom = nom;
        }
    }

    public void vendre(Article article){
        if(this.boutiqueArticles.contains(article)){
            this.boutiqueArticles.remove(article);
        }
    }

    public void recuperer(Article article){
        this.boutiqueArticles.add(article);
    }

    public void echanger(Article articleRendu, Article articleRepris, Client client ){
        if(this.boutiqueArticles.contains(articleRepris)){
            if(client.getMesArticles().contains(articleRendu)){
                if(articleRendu.isNeuf()){
                    client.rendre(articleRendu);
                    recuperer(articleRendu);
                    client.acheter(articleRepris, this);
                    articleRendu.setNeuf(false);
                }else{
                    System.out.println("L'article doit être neuf pour pouvoir l'échanger.");
                }
            }else{
                System.out.println("Vous n'avez pas l'objet que vous souhaitez échanger");
            }
        }else{
            System.out.println("La boutique n'a pas l'objet désiré");
        }
    }

    public void ajusterArticle(Ajustable article){

        if(article instanceof Accessoire){
            if(((Accessoire) article).isTailleChangeable()){
                article.ajuster();
            }else{
                System.out.println("Cette ceinture ne peut pas s'ajuster");
            }
        }else if(article instanceof Vetement){
            article.ajuster();
        }else{
            System.out.println("On peut seulement ajuster les ceintures et les vêtements");
        }
    }

    @Override
    public String toString() {
        return "Boutique{" +
                "nom ='" + nom + '\'' +
                ", boutiqueArticles =" + boutiqueArticles +
                '}';
    }

    // TODO
    public void montrerStock(){
        for (Article boutiqueArticle : boutiqueArticles) {

            System.out.println(boutiqueArticle.toString());
        }
    }
    public void solder(Article article,double reduction){
        article.solder(reduction);
    }


}
