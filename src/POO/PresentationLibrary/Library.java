package POO.PresentationLibrary;

import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Library <T extends Media> {
    private String name="DefaultLib";
    private String mediaBorrowedFile;
    private String libraryCatalogFile;

    public Library(String name) {
        setName(name);
        this.mediaBorrowedFile=name+"_Media_borrowed_list.txt";
        this.libraryCatalogFile=name+"_Library_Catalog_list.txt";
    }

    public void addMediaToCatalogFile (T aMedia){
        if (aMedia!=null){
            if(checkIfBanned(aMedia.getAuthorName())){
                throw new AuthorBannedException(aMedia.getAuthorName());
            }
            Random rnd = new Random();
            int rdmId= rnd.nextInt(1000) + 1;;
            String aId=aMedia.getId()+rdmId;
            char type=aId.charAt(0);
            aMedia.setId(aId);
            try (FileWriter fw = new FileWriter(this.getLibraryCatalogFile(), true)){
                fw.append(aMedia.getId())
                        .append('/')
                        .append(aMedia.getTitle())
                        .append('/')
                        .append(aMedia.getAuthorName())
                        .append('/')
                        .append(String.valueOf(aMedia.getPrice()))
                        .append('/');
                if (type=='B'){
                    fw.append(String.valueOf(((Book)aMedia).getPageNumber()))
                            .append('\n');
                }
                if (type=='A'){
                    String tracks="";
                    for (String t:((Album)aMedia).getListNameTitles())
                    {
                        tracks=tracks+t+",";
                    }

                    fw.append(tracks)
                            .append('\n');
                }
                if (type=='D'){
                    fw.append(String.valueOf(((BD)aMedia).getNamePainter()))
                            .append('\n');
                }

                System.out.println("--------{ "+aMedia.getTitle() + " / "+aMedia.getAuthorName() +" } (ID: "+ aMedia.getId()+") est ajouté dans {" +this.getName()+"} bibliothèque ------");
            }catch(IOException exc){
                System.out.println(exc.getMessage());
            }
        }
    }


    public void takeMedia (String title, String author, String CustomerName) throws Exception {
        boolean isTaken=false;
        ArrayList<Media> mediasList = this.getAllMedia();
        if (mediasList.size()!=0) {
            for (Media aMedia:mediasList) {
                if (!isTaken){
                    if (aMedia.getTitle().equals(title)&& aMedia.getAuthorName().equals(author) ){
                        if (!isBorrowed(aMedia)){
                            try (FileWriter fw = new FileWriter(this.getMediaBorrowedFile(), true)){
                                fw.append(aMedia.getId())
                                        .append('/')
                                        .append(aMedia.getTitle())
                                        .append('/')
                                        .append(aMedia.getAuthorName())
                                        .append('/')
                                        .append(CustomerName)
                                        .append('\n');
                                System.out.println(CustomerName+" prend --" + aMedia.getClass().getSimpleName()+ " --{ "+aMedia.getTitle()+" / "+aMedia.getAuthorName() + "} (ID: "+ aMedia.getId()+") ------");
                                isTaken=true;
                            }catch(IOException exc){
                                System.out.println(exc.getMessage());
                            }
                        }
                    }
                }
        }
            if (!isTaken) System.out.println("Dear "+CustomerName+", there is no  { "+title+" / "+author+" }" );
        }
    }

    public boolean isBorrowed(Media aMedia){
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(this.getMediaBorrowedFile()));
            String line;
            while((line = br.readLine()) != null){
                String[] stringMed = line.split("/");
                if(stringMed.length == 4)
                {
                    if(stringMed[0].equals(aMedia.getId())){
                        return true;
                    }
                }
            }
            br.close();
        }catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        return false;
    }



    public ArrayList<Media> getAllMedia() throws Exception{
        BufferedReader br;
        ArrayList<Media> mediasList = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(this.getLibraryCatalogFile()));
            String line;
            while((line = br.readLine()) != null){
                String[] stringMed = line.split("/");
                if(stringMed.length == 5)
                {
                    if(stringMed[0].charAt(0)=='A'){
                        ArrayList<String> listTacks=new ArrayList<>();
                        String[] traks=stringMed[4].split(",");
                        for (String t : traks) {
                            if(!t.isEmpty()){
                                listTacks.add(t);
                            }
                        }
                        Album album = new Album(stringMed[0],stringMed[1],stringMed[2],Float.parseFloat(stringMed[3]),listTacks);
                        mediasList.add(album);
                    }
                    else if(stringMed[0].charAt(0)=='B'){
                        Book book=new Book(stringMed[0],stringMed[1],stringMed[2],Float.parseFloat(stringMed[3]),Integer.parseInt(stringMed[4]));
                        mediasList.add(book);
                    }
                }
            }
            br.close();
        }catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
        return mediasList;
    }

    public void printCatalog() throws Exception {
        ArrayList<Media> mediasList = this.getAllMedia();
        if (mediasList.size()>0) {
            StringBuffer sBuffer = new StringBuffer("###################################################\n");
            sBuffer.append("----{" + this.getName() + "}---LIBRARY CATALOG -----  \n");
            sBuffer.append("###################################################\n");
            for (Media m : mediasList) {
                sBuffer.append("----{ID: " + m.getId() + " } " + "---------");
                sBuffer.append(m.toString());
            }
            sBuffer.append("###################################################\n");
            System.out.println(sBuffer.toString());

        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLibraryCatalogFile() {
        return libraryCatalogFile;
    }


    public String getMediaBorrowedFile() {
        return mediaBorrowedFile;
    }



    @Override
    public String toString() {
        StringBuffer sBuffer = new StringBuffer("Info : - " +this.getClass().getSimpleName()+" - \n");
        sBuffer.append("nom de la bibliothèque                         : " + this.getName()+ "\n");
        sBuffer.append("nom du fichier catalogue                       : " + this.getLibraryCatalogFile()+ "\n");
        sBuffer.append("nom du fichier avec la liste des livres prêtés : " + this.getLibraryCatalogFile()+ "\n");
        return sBuffer.toString();
    }

    public List<String> getBannedList(){
        List<String> bannedAuthors = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("bannedAuthor.txt"));
            String author;

            while((author = br.readLine()) != null)
            {
                bannedAuthors.add(author);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return bannedAuthors;
    }

    public boolean checkIfBanned (String authorName) {
        boolean isFound = false;

        List<String> bannedList = getBannedList();

        for (String bannedAuthorName : bannedList) {
            if (bannedAuthorName.equals(authorName)) {
                isFound = true;
            }
        }
        return isFound;
    }

    public void returnMedia(String id){
        BufferedReader br;
        ArrayList<Media> mediasList = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(this.getMediaBorrowedFile()));
            StringBuffer sb=new StringBuffer("");

            String line;
            while((line = br.readLine()) != null){
                if(!line.contains(id)){
                    sb.append(line+"\n");
                }


            }
            FileWriter fw=new FileWriter(new File(this.getMediaBorrowedFile()));
            //Write entire string buffer into the file
            fw.write(sb.toString());
            br.close();
        }catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

    }
}
