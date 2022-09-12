import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //To Create an object of a class:
            //ClassName objectName = new ClassConstructor(parameters for obj);
        Scanner ui = new Scanner(System.in);
        System.out.println("The question, as in what is your name");
        String name = ui.nextLine();        //take in user input

        System.out.println("Hello "+name);

        //good practice but not required
        ui.close();
    }
}