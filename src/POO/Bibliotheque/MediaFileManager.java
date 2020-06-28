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
        String last="";
        try (FileWriter fw = new FileWriter(filename, true)){
            if(media.getType()==MediaType.Album){
                last=((Album)media).getListNameTitles().toString();
                last=last.replaceAll("[\\[\\]]","");
            }
            fw.append(media.getId())
                    .append('/')
                    .append(media.getTitle())
                    .append('/')
                    .append(media.getAuthorName())
                    .append('/')
                    .append(String.valueOf(media.getPrice()))
                    .append('/')
                    .append(media.getType().toString())
                    .append('/')
                    .append(last)
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
            //Media media=new Media();
            while((line = br.readLine()) != null){
                String[] stringMed = line.split("/");
                if(stringMed.length == 6)
                {
                    if(MediaType.valueOf(stringMed[4])==MediaType.Album){
                        ArrayList<String> list=new ArrayList<>();
                        String[] str=stringMed[5].split("/");
                        for (String s : str) {
                            list.add(s);
                        }
                        Album album = new Album(stringMed[0],stringMed[1],stringMed[2],Double.parseDouble(stringMed[3]),list);
                        medias.add(album);//
                    }

                    //medias.add(media);//
                }
            }

            br.close();
        }catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        return medias;
    }
}
