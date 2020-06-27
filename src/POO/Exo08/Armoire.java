package POO.Exo08;

import java.util.ArrayList;
import java.util.Stack;

public class Armoire  {

    private Stack<Integer> verre=new Stack<>();
    private Stack<Integer> assiette=new Stack<>();

    public void pushVerre(int x){
        verre.push(x);
    }
    public void pushAssiette(int x){
        assiette.push(x);
    }



}
