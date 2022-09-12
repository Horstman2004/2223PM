import java.util.Scanner;

public class FunctionPractice {
    public static void main(String[] args){
        //Static Method
        //Python ClassName.method()
        addTwoNumbers();
        addTwoNumbers(2.4,2.6);
        addTwoNumbers(2,5);
        addTwoNumbers(0,1);

        //if static method
        //PrintFunctions.print("Howdy");
        //PrintFunctions pf = new.PrintFunctions();
        //pf.print("Howdy");

        print("Howdy");

        Scanner ui = new Scanner(System.in);
        String a = ui.nextLine(); //return a string
        double b = ui.nextDouble(); //return a double
        //addTwoNumbers(b,a);


    }

    //@static method
    //signature of the method
    //private => only this class can access
    //static => no need for an object of the class to be instantiated
    //void => means no return data
    public static void addTwoNumbers(){
        /*
            BELLRINGER  
                Create a program that takes in 2 numbers
                    and prints the two numbers added together.
                hint hint:
                    Scanner.nextLine()
                    Scanner.nextInt()
                    ScannerDouble()
         */
        Scanner ui = new Scanner(System.in);
        double num1,num2,total;
        System.out.println("Please enter a number: ");
        num1 = ui.nextDouble();
        System.out.println("Please enter another number: ");
        num2 = ui.nextDouble();
        total = (num1-num2);
        System.out.println("Total: " + total);

        ui.close();
    }

    //Python Freak out
    //def addTwoNumber():
    //def addTwoNumbers(a):

    //Java You can have Two Classes
    private static void addTwoNumbers(double a, double b){
        //a and b are local varibles
        System.out.printf("%2.2f%n",(a+b));
    }

    private static void addTwoNumbers(int a, int b){
        //a and b are local varibles
        System.out.printf("%2.2f%n",(a+b));
    }

    //you can have as amny methods are you want, 
    //as long as the siganture is different
    //private static double addTwoNumbers(){
    //    //a and b are local varibles
    //    System.out.printf("%2.2f%n",(a+b));
    // }

    public static void print(String s){
        System.out.println(s);
    }
    public static void print(int i){
        System.out.println(i);
    }
    public static void print(double d){
        System.out.println(d);
    }
    public static void print(boolean b){
        System.out.println(b);
    }


    /* 
    RULE OF THUMBS

        Who needs acces to the method? public or private
        Do I need an object to use the method?
        Am I returning information?
        Will i have different data types?

        -methods are verbs therefore the name should be some type of verb
            bob() -> bob is a noun not a verb
     */

}

