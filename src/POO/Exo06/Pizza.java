package POO.Exo06;
import java.util.ArrayList;
import java.util.List;
public class Pizza {
    public static Ingredient ingDeBase=new Ingredient("pate",1);
    private String nom;
    private  List<Ingredient> ingredientList = new ArrayList<>();
    private  List<Ingredient> ingredientBanniList = new ArrayList<>();
    private boolean cuite = false;

    // Constructors

    public Pizza(String nom, List<Ingredient> ingredientList) {
        this.nom = nom;
        ingredientBanniList.add(new Ingredient("ananas",5));
        ingredientBanniList.add(new Ingredient("pomme",5));
        ingredientBanniList.add(new Ingredient("chocolat",5));
        ingredientBanniList.add(new Ingredient("miel",4));

        for (Ingredient ing :ingredientList) {
            this.addIngredient(ing);
        }
        this.ingredientList = ingredientList;
    }

    public Pizza(String nom) {
        this.nom = nom;
        this.addIngredient(ingDeBase);
    }

    // Methods

    public boolean cuire(){
        if(!isCuite()){
            if( this.ingredientList.size() < 3 || this.ingredientList.size() > 10 )
            {
                System.out.println("La cuisson est raté");
                return false;
            }

            System.out.println("La cuisson est réussie");
            this.setCuite(true);
            return true;
        }
        else{
            System.out.println("il est deja cuit");
            return false;
        }


    }

    // Get/Set

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }
    private void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public boolean isCuite() {
        return cuite;
    }

    public void setCuite(boolean cuite) {
        this.cuite = cuite;
    }
    public boolean addIngredient(Ingredient ing){
        if(!this.isCuite()){

            if(!ingredientBanniList.contains(ing)){
                if(this.getIngredientList().contains(ing))
                {
                    int i=this.getIngredientList().indexOf(ing);
                    if(this.ingredientList.get(i).getQtt()+ing.getQtt()>0 && this.ingredientList.get(i).getQtt()+ing.getQtt()<=8){
                        this.ingredientList.set(i,new Ingredient(ing.getNom(),this.ingredientList.get(i).getQtt()+ing.getQtt()));
                        return true;
                    }
                    else{
                        System.out.println("L'ingredient "+this.nom+" n'a pas été modifié");
                        return false;
                    }


                }
                if(ing.getQtt()>0 && ing.getQtt()<=8)
                {
                    System.out.println("L'ingredient "+this.nom+" a été ajouté");
                    this.ingredientList.add(ing);
                    return true;
                }
                else{
                    System.out.println("L'ingredient "+this.nom+" n'a pas été ajouté");
                    return false;
                }
            }
            else
            {

                System.out.println("L'ingredient "+this.nom+" n'a pas été ajouté");
                return false;
            }

        }
        else{
            System.out.println("il est deja cuite");
            return false;
        }


    }
    public void voirIng(){
        for (Ingredient i:ingredientList) {
            System.out.println(i.getNom());
        }
    }

    public static Ingredient getIngDeBase() {
        return ingDeBase;
    }

    public List<Ingredient> getIngredientBanniList() {
        return ingredientBanniList;
    }
}
