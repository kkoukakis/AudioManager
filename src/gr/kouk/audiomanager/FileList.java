package gr.kouk.audiomanager;


import java.io.File;
import java.io.PrintWriter;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.Scanner;

public class FileList {

    private ArrayList<Mediafile> mediafiles = new ArrayList<>();

    public void add(Mediafile p){
        mediafiles.add(p);
    }

    public void remove(int index){
        if(index >=0 && index < mediafiles.size())
            mediafiles.remove(index);
        else
            System.out.println("Index out of bound.");
    }

    public void clearProducts () {
        mediafiles.clear();
        System.out.println("Clear done.");
    }

    public void  display (){
        mediafiles.forEach(System.out::println);
    }


    public  void loadlist(String filename){
        try {
            Scanner scanner = new Scanner(new File(filename));

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(",");
                if(words[3].equals("IMAGE")){
                    Image img = new Image(Integer.parseInt(words[0]),words[1],words[2], words[3],words[4],words[5], words[6], words[7],words[8], Boolean.parseBoolean(words[9]) ,Integer.parseInt(words[10]), Integer.parseInt(words[11]));
                    mediafiles.add(img);
                }else if(words[3].equals("VIDEO")){
                    Video img = new Video(Integer.parseInt(words[0]),words[1],words[2], words[3],words[4],words[5], words[6], words[7],words[8], Boolean.parseBoolean(words[9]) ,Integer.parseInt(words[10]), Integer.parseInt(words[11]), Integer.parseInt(words[12]));
                    mediafiles.add(img);
                }
                else if(words[3].equals("AUDIO")){
                    Audio img = new  Audio(Integer.parseInt(words[0]),words[1],words[2], words[3],words[4],words[5], words[6], words[7],words[8], Boolean.parseBoolean(words[9]) ,Integer.parseInt(words[10]), Boolean.parseBoolean(words[11]));
                    mediafiles.add(img);
                }
            }


        } catch (Exception e) {
            System.out.println("The file cannot be loaded");
        }
    }


    public void saveList(){
        try{
            PrintWriter printWriter = new PrintWriter(new java.io.File("list.txt"));
            for (int i = 0; i<mediafiles.size(); i++) {
                printWriter.println(mediafiles.get(i).toStringCSV());
            }
            printWriter.close();
        }
        catch(Exception e){
            System.out.println("The file cannot be saved");
        }
    }

    public int getSize(){
        return mediafiles.size();
    }

    public void displayitem(int index){
        if(index <getSize() && index >=0)
        System.out.println(mediafiles.get(index).toString());
        else
            System.out.println("Out of bounds");
    }

    public void search(){
        int input = -1;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Print by: \n1. id\n2. title");
            switch (input = Integer.parseInt(scanner.next())){
                case 1:
                    Scanner scanner2 = new Scanner(System.in);
                    try {

                        int input1 = -1;
                        input1 = scanner2.nextInt();
                        displayitem(input1);
                    }catch (Exception e){
                        System.out.println("You did not give a number");
                        break;
                    }

                    break;
                case 2:
                    Scanner scanner3 = new Scanner(System.in);
                    try{
                        String input2 = "";
                        input2 = scanner3.next();




                    }catch (Exception e){
                        System.out.println("You did not give a number");
                        break;
                    }
                    break;
                default:
                    System.out.println("wrong input");
            }
        }while(input != 0);


    }






}
