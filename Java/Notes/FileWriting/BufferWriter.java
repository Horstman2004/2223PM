import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferWriter {
    // read in the file and print to the console

    // globals
    private static final String DATA_FILE = "mymedia.txt";
    private static Scanner in;
    private static BufferedWriter out;

    public static void writeString(String s) {

        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            } catch (Exception e) {
                System.err.println("Cannot open file for output!");
                e.printStackTrace(); // very useful -> prints out he error
            }
        }
        try {
            out.write(s);
            out.newLine();
        } catch (Exception e) {
            System.err.println("Cannot write file!");
            e.printStackTrace(); // very useful -> prints out he error
        }
    }

    public static void saveAndClose() {
        //closes after the Scanner is done reading the file
        //save
        if(in!=null){
            try{
                in.close();
                in=null;    //reset the object to be used again later
            }
            catch(Exception e){
                System.err.println("Cannot close input file!");
                e.printStackTrace(); // very useful -> prints out he error
            }
        }
        //close
        if(out!=null){
            try{
                out.close();
                out=null;    //reset the object to be used again later
            }
            catch(Exception e){
                System.err.println("Cannot close output file!");
                e.printStackTrace(); // very useful -> prints out he error
            }
        }
        //technically you need both to save and close
    }

    public static String readString() {
        //check to see if in is already in there if not create it
        if(in!=null){
            try{
                in = new Scanner(new File(DATA_FILE));
            }
            catch(Exception e){
                System.err.println("Cannot open file for output!");
                e.printStackTrace(); // very useful -> prints out he error
            }
        }
        //read in the values from the text file
        try{
            //if there's a new line read it in
            if(in.hasnext()){
                String s = in.nextLine();
                return s;                       //grabs EVERYTHING
            }
            else{
                return null;
            }
        }
        catch(Exception e){
            System.err.println("Cannot read the file!");
            e.printStackTrace(); // very useful -> prints out he error
        }
        return null;
    }
}
