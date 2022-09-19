package Notes.Unit2;
import java.util.Scanner;


public class LoopityLoops {
    public static void main(String[] args){
        //while conditional statement
        //while boolean expression{
        //      do something
        //}

        // while(true){
        //     System.out.println("HI");
        // }

        //while loops are recursive conditional statements
        //keeps happening until the condition is met
        // if(i==9){
        //     System.out.println(i);
        // }

        //print out the numbers 1 - 10
        int i=0;
        while(i<10){
            System.out.print(i+",");
            i++;
        }

        System.out.println();

        //print 0-9
        //for(some var;boolean expression;step)
        for(int j=0;j<=9;j++){
            if(j<=8){
                System.out.print(j+",");
            }
            else{
                System.out.print(j);
            }

        }
        //for i in range(#):
        //for item in list:
    }

        //create a f(x)tha takes in positive integers user input until they type in -1
        //  after they type in -1, output the min and max value they entered
        private static void minMaxChecker(){
            Scanner ui = new Scanner(System.in);
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            System.out.println("Enter an integer: ");
            int intVal = ui.nextInt();
            while(intVal!=-1){
                if(intVal > max){
                    max = intVal;
                }
                else if(intVal < min){
                    min=intVal;
                }
                //step
                System.out.println("Enter an integer: ");
                intVal = ui.nextInt();
            }


            System.out.println("min :"+min);
            System.out.println("max :"+max);
            System.out.printf("min: %d, max: %d",min,max);
            ui.close();

        } 
}
