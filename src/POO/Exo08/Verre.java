package POO.Exo08;

import java.util.ArrayList;

public class Verre implements PileInterface<Integer> {
    int top=-1;
    ArrayList<Integer> st=new ArrayList<>();
    public Verre() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void push(Integer item) {

    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }
}
