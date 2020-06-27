package POO.Exo07;

import java.util.ArrayList;

public class Musicien {
    private float sold;
    private ArrayList<Instrument> instSpe;
    private ArrayList<Instrument> instPossede;
    private ArrayList<Instrument> instJouer;
    private String nom;

    public ArrayList<Instrument> getInstPossede() {
        return instPossede;
    }

    public void setInstPossede(ArrayList<Instrument> instPossede) {
        this.instPossede = instPossede;
    }

    public Musicien(float sold, ArrayList<Instrument> instSpe, ArrayList<Instrument> instPossede, ArrayList<Instrument> instJouer, String nom) {
        this.sold = sold;
        this.instSpe = instSpe;
        this.instPossede = instPossede;
        this.instJouer = instJouer;
        this.nom = nom;
        Instrument isp=new Guitar();
    }

    public Musicien(float sold, ArrayList<Instrument> instSpe, String nom) {
        this.sold = sold;
        this.instSpe = instSpe;
        this.nom = nom;
    }

    public float getSold() {
        return sold;
    }

    public ArrayList<Instrument> getInstSpe() {
        return instSpe;
    }

    public String getNom() {
        return nom;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public void setInstSpe(ArrayList<Instrument> instSpe) {
        this.instSpe = instSpe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void acheter(Instrument i){
        instPossede.add(i);

    }
    public void jouer(Instrument i){
        instJouer.add(i);
    }
}
