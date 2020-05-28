package POO.pooPresentation;

import java.util.ArrayList;

public class Client {
    private String nom = "Zara";
    private double solde = 0;
    private ArrayList<Article> mesArticles = new ArrayList<>();

    public Client(String nom, double solde) {
        this.setNom(nom);
        this.setSolde(solde);
    }



    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        if(!nom.isBlank()){
            this.nom = nom;
        }
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        if(solde >= 0){
            this.solde = solde;
        }
    }

    public ArrayList<Article> getMesArticles() {
        return mesArticles;
    }

    public void setMesArticles(ArrayList<Article> mesVetements) {
        this.mesArticles = mesVetements;
    }


    // Acheter vêtement

    public void acheter(Article article, Boutique boutique) {
        if(article.getPrix() <= this.getSolde()){
            System.out.println(this.getNom() + " achète " + article.getNom());
            this.setSolde( this.getSolde() - article.getPrix());
            mesArticles.add(article);
            boutique.vendre(article);
        }else{
            System.out.println("Vous n'avez pas les moyens.");
        }
    }

    public void rendre(Article article){
        this.setSolde(this.getSolde() + article.getPrix());
        this.mesArticles.remove(article);

    }

    public void listMesArticle(){
        for (Article mesArticle : mesArticles) {
            System.out.println(mesArticle.toString());
        }
    }



}
