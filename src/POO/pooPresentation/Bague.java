package POO.pooPresentation;

public final class Bague extends Accessoire{
    String metal;

    public Bague(double prix, String marque, String nom, String description,  String metal) {
        super(prix, marque, nom, description);
        this.setMetal(metal);

    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(super.toString())
                .append( " metal = " ).append(this.getMetal());
        return sb.toString();
    }

    @Override
    public void solder(double reduction) {
        System.out.println("reduire le prix de la bague");
    }
}
