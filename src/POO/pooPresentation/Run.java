package POO.pooPresentation;

public class Run {


    public static void main(String[] args) {

        Ceinture ceinture1 = new Ceinture(25,
                "Graou",
                "Dark Mode Leather K9",
                "Ceinture cuir noir à bord larges et coutures visibles",
                true,
                55
        );

        Vetement vetement1 = new Vetement(55,
                "Gucci",
                "Hoodies fermeture capuche",
                "LightGrey"
        );

        Bague bague1 = new Bague(200,
                "Knight",
                "K Ring 6 Red",
                "Bague rubis ornée",
                "or blanc"
        );


        Boutique maBoutique = new Boutique("Zara");

        maBoutique.boutiqueArticles.add(ceinture1);
        maBoutique.boutiqueArticles.add(vetement1);
        maBoutique.boutiqueArticles.add(bague1);

        maBoutique.ajusterArticle(ceinture1);
        maBoutique.ajusterArticle(vetement1);

        maBoutique.montrerStock();
        Client client=new Client("covi",1000);
        client.acheter(ceinture1,maBoutique);


        System.out.println("articles dans la boutique");
        maBoutique.montrerStock();
        client.rendre(ceinture1);
        System.out.println("mes achats");
        client.listMesArticle();
        System.out.println(client.getSolde());
        bague1.solder(0);
        ceinture1.solder(10);
        System.out.println(ceinture1.getPrix());
        vetement1.solder(95);
        System.out.println(vetement1.getPrix());
    }



}
