package gr.kouk.audiomanager;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ui {
    public void init(){
        System.out.println("v~v~v~v~v~v~v~v~v~v~v~v~v~v~v~v~v~v~");
        System.out.println("{----A-U-D-I-O---M-A-N-A-G-E-R-----}");
        System.out.println("~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^~^");
    }
    public Choice menu(){
        System.out.println("-------------m-e-n-u---------------");
        System.out.println("1. Add a file to the list?\n2. Remove a file from the list\n" +
                            "3. Display List\n4. Clear List\n5. Reload List\n" +
                            "6. Save list\n7. Search File\n0. Exit");
        System.out.println("-----------------------------------");
        int choice ;
        Scanner scanner = new Scanner(System.in);
        try{
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    return Choice.A;
                case 2:
                    return Choice.B;
                case 3:
                    return Choice.C;
                case 4:
                    return Choice.D;
                case 5:
                    return Choice.E;
                case 6:
                    return Choice.F;
                case 7:
                    return Choice.G;
                case 0:
                    //Exit
                    return Choice.H;
                default:
                    return Choice.I;
            }
        }catch(Exception e){
            //ERROR
            return Choice.J;
        }
    }




    public void manage(FileList list){
        init();
        Choice choice;
        do {
            choice = menu();
            switch (choice) {
                case A:
                    newfile(list);
                    break;
                case B:
                    removefile(list);
                    break;
                case C:
                    list.display();
                    break;
                case D:
                    list.clearProducts();
                    break;
                case E:
                    //LOAD LIST
                    list.loadlist("list.txt");
                    break;
                case F:
                    //SAVE LIST
                    list.saveList();
                    break;
                case G:
                    //SEARCH FILE
                    break;
                case H:
                    //Exit
                    return;
                case I:
                    break;
            }
        }while(choice != Choice.J);

    }


    public Boolean newfile(FileList list){

        Mediafile o = null;
        int id = -1;
        String title;
        String filepath;
        String filetype;
        String description;
        String filesize;
        String quality;
        Boolean availability; String _availability;
        String creator;
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("Give the media filetype (IMAGE/AUDIO/VIDEO):");
                filetype = scanner.next();
            }while( !filetype.startsWith("IMAGE") && !filetype.startsWith("AUDIO") && !filetype.startsWith("VIDEO"));
            System.out.println("Give the media title:");
            title = scanner.next();
            System.out.println("Give the media filepath:");
            filepath = scanner.next();
            System.out.println("Give the media description:");
            description = scanner.next();
            System.out.println("Give the media filesize:");
            filesize = scanner.next();
            System.out.println("Give the media quality:");
            quality = scanner.next();
            Boolean correct = true;
            try{
                System.out.println("Give the media id:");
                id = scanner.nextInt();
            }catch(Exception e){
                System.out.println("Error you should give numbers");
                return false;
            }

            do{
                System.out.println("Give the media availability (Y/N):");
                _availability = scanner.next();
            }while(!_availability.startsWith("Y") && !_availability .startsWith("N"));

            availability = _availability == "Y" ? true : false;

            System.out.println("Give the media Creator");
            creator = scanner.next();

            switch (filetype)
            {
                case "IMAGE":
                    int width=0;
                    int height=0;
                    Boolean correct1 = true;
                    do{
                        try{

                            System.out.println("Give the image width:");
                            width = scanner.nextInt();
                            System.out.println("Give the image height:");
                            height = scanner.nextInt();
                            break;
                        }catch(Exception e){
                            System.out.println("Error you should give numbers");
                            return false;
                        }
                    }while(!correct1);

                   Image i1 = new Image(id,title, filepath, filetype, description, filesize, quality, java.time.LocalDate.now().toString(),creator, availability, width, height);
                   list.add(i1);
                   break;

                case "AUDIO":
                    int duration=0;
                    Boolean ismusic;
                    String _ismusic = "";
                    Boolean correct2 = false;
                    try{
                        System.out.println("Give the audio duration:");
                        width = scanner.nextInt();

                        }
                    catch(Exception e){
                            System.out.println("please give numbers");
                        }
                    correct = false;
                    do{
                        try{
                            System.out.println("Is the audio music? (Y/N):");
                            _ismusic = scanner.next();
                            break;
                        }
                        catch(Exception e){
                            System.out.println("please give 'Y' or 'N'");
                            correct1 = false;
                        }
                    }while(!correct1);
                    ismusic = _ismusic == "Y" ? true : false;

                    Audio a1 =  new Audio(id, title, filepath, filetype, description, filesize, quality, java.time.LocalDate.now().toString(), creator, availability, duration, ismusic);
                    list.add(a1);
                    break;
                case "VIDEO":
                   int duration1 = 0;
                    int width1 = 0;
                    int height1 = 0;
                    correct = false;
                    do{
                        try{
                            System.out.println("Give the video duration:");
                            duration1 = scanner.nextInt();
                            System.out.println("Give the video width:");
                            width1 = scanner.nextInt();
                            System.out.println("Give the video height:");
                            height1 = scanner.nextInt();

                            break;
                        }catch(Exception e){
                            System.out.println("Error you should give numbers");
                            return false;
                        }
                    }while(!correct);
                    Video v1 = new Video(id,title, filepath, filetype, description, filesize, quality, java.time.LocalDate.now().toString() ,creator, availability, duration1, width1, height1);
                    list.add(v1);
                    break;
                default:
                    return null;
            }

        return true;
    }


    public void removefile(FileList list){
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        try{
            System.out.println("Give index of file:");
            i = scanner.nextInt();

        }catch (Exception e){
            System.err.println("Error removing");
        }

        if(i<list.getSize() && i>=0) {
            list.remove(i);
        }

    }

}
