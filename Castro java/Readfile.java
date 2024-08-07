import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Readfile {
   /*** public static void main(String arg[]){
        
        try{
            File myfile = new File("C:/Users/HP/Desktop/COPIED LINKS FROM COURSERA FOR FLEX.txt");
            Scanner myreadfile = new Scanner(myfile);
            while(myreadfile.hasNextLine()){
                String data = myreadfile.nextLine();
                System.out.println(data);
            }
        myreadfile.close();
        }catch(FileNotFoundException e){
            System.out.println("An error occurred.");
        }
    } ***/
    public static void main(String args[]){
        /***try{
            FileWriter myfile = new FileWriter("C://Users//HP//Desktop//New folder (3)//javafile2.txt");
            myfile.write("This is my first time writing into a file using java.\nAnd it's been fun.");
            myfile.close();
            File myread = new File("C:/Users/HP/Desktop/New folder (3)/javafile2.txt");
            Scanner myreadfile = new Scanner(myread);
            while(myreadfile.hasNextLine()){
                String data = myreadfile.nextLine();
                System.out.println(data);
            }
            if(myread.exists()){
                System.out.println("File name: " + myread.getName());
                System.out.println("Absolute path: " + myread.getAbsolutePath());
                System.out.println("Readable: " + myread.canRead());
                System.out.println("Writerable: " + myread.canWrite());
                System.out.println("Length: " + myread.getTotalSpace());
            }
            
            myreadfile.close();
        }catch(IOException e){
            System.out.println("An error occured");
        }***/
        File delete = new File("C://Users//HP//Desktop//New folder (4)");
        if(delete.delete()){
            System.out.println("Folder deleted");
        }else{
            System.out.println("Failed to delete Folder");
        }
    }
}