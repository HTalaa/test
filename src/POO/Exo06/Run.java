package POO.Exo06;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {

        Ingredient oignon = new Ingredient("oignon", 5);
        Ingredient fromage = new Ingredient("fromage", 10);
        Ingredient poivron = new Ingredient("poivron", 5);
        Ingredient olive = new Ingredient("olive", 5);
        Ingredient concombre = new Ingredient("concombre", 5);
        Ingredient ananas = new Ingredient("ananas", 5);
        Ingredient tomate = new Ingredient("tomate", 5);
        Ingredient pate = new Ingredient("pate", 5 );


        Pizza pizza=new Pizza("pizza",new ArrayList<>());
        Pizza p1=new Pizza("p1");
        p1.ingDeBase=oignon;
        p1.voirIng();
        p1.addIngredient(fromage);
        p1.addIngredient(pate);
        p1.addIngredient(ananas);
        p1.addIngredient(pate);
        p1.voirIng();


    }
}
