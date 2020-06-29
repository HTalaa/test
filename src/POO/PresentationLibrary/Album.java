package POO.PresentationLibrary;

import java.util.ArrayList;
import java.util.List;

public class Album extends Media {

    private List<String> listNameTitles =new ArrayList<>();


    public Album(String title, String authorName, float price, List<String> listNameTitles) throws Exception{
        super(title, authorName, price);
        this.setListNameTitre(listNameTitles);
        this.setId("A-");// + countId);
    }

    public Album(String id,String title, String authorName, float price, List<String> listNameTitles) throws Exception{
        super(title, authorName, price);
        this.setListNameTitre(listNameTitles);
        this.setId(id);// + countId);
    }




    // Title cannot be empty
    private void setListNameTitre(List<String> listNameTitre) throws Exception {
        final String ANSI_RESET = "\u001B[0m",  ANSI_PURPLE = "\u001B[35m";
        for (String i : listNameTitre) {
            if ((i.isBlank()) ||  (i==null) ){
                throw new Exception(ANSI_PURPLE+"Attention! Le titre de la piste dans l'album ne peut pas être vide "+ANSI_RESET+"\n");
            }
            else {
                this.listNameTitles.add(i);
            }
        }
    }

    public List<String> getListNameTitles() {
        return listNameTitles;
    }



    @Override
    public String toString() {
        StringBuffer sBuffer = new StringBuffer(super.toString()+"Liste des noms de titres : ");
        for (String i : this.listNameTitles) {
            sBuffer.append("- "+ i + "; ");
        }
        sBuffer.append("\n");
        return sBuffer.toString();
    }

}
