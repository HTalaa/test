package POO.Exo3;

public class Dalmatien  extends  Chien{
    private int nombreDePoint;
    public Dalmatien(String nom,String dateNaiss,double taille,String race,int nombreDePoint){
        super(nom, dateNaiss, taille, race);
        setNombreDePoint(nombreDePoint);
    }
    public void setNombreDePoint(int nombreDePoint){
        if(nombreDePoint>=0)
            this.nombreDePoint=nombreDePoint;
        else
            System.out.println("Nombre de point dois être plus grand ou egal 0");
    }
}
