package POO.Bibliotheque;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MediaFileManager {
    private final String filename;
    private final static String DEFAULT_FILENAME = "C:\\Users\\java\\Desktop\\algo1\\src\\POO\\Bibliotheque\\media.txt";
    /*CONSTRUCTOR*/
    public MediaFileManager() {
        this.filename = DEFAULT_FILENAME;
    }
    public MediaFileManager(String filename) {
        this.filename = filename;
    }

    public void add(Media media){
        try (FileWriter fw = new FileWriter(filename, true)){
            fw.append(media.getTitre())
                    .append('/')
                    .append(media.getNomAuteur())
                    .append('/')
                    .append(String.valueOf(media.getPrix()))
                    .append('/')
                    .append(media.getType().toString())
                    .append('\n');
        }catch(IOException exc){
            System.out.println(exc.getMessage());
        }
    }
    public ArrayList<Media> getAll(){
        BufferedReader br;
        ArrayList<Media> medias = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(filename));
            String line;
            while((line = br.readLine()) != null){
                String[] stringMed = line.split("/");
                if(stringMed.length == 4)
                {
                    Media media = new Media(stringMed[0],stringMed[1],Double.parseDouble(stringMed[2]),MediaType.valueOf(stringMed[3]));
                    medias.add(media);//
                }
            }

            br.close();
        }catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        return medias;
    }
}
