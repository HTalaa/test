package POO.Exo06;
import java.util.ArrayList;
import java.util.List;
public class Pizza {
    private String nom;
    private static List<Ingredient> ingredientList = new ArrayList<>();
    private boolean cuite = false;

    // Constructors

    public Pizza(String nom, List<Ingredient> ingredientList) {
        this.nom = nom;
        this.ingredientList = ingredientList;
    }

    public Pizza(String nom) {
        this.nom = nom;
    }

    // Methods

    public boolean cuire(){
        if( this.ingredientList.size() < 3 || this.ingredientList.size() > 10 )
        {
            System.out.println("La cuisson est raté");
            return false;
        }

        System.out.println("La cuisson est réussie");
        this.setCuite(true);
        return true;
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
    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public boolean isCuite() {
        return cuite;
    }

    public void setCuite(boolean cuite) {
        this.cuite = cuite;
    }
    public void addIngredient(String nom,int qtt){
        if(qtt>0 && qtt<8)
            ingredientList.add(new Ingredient(nom,qtt));
        else
            System.out.println("le quantité est entre 1 et 8");
    }

}
