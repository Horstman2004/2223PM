import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class BasciMathQuiz {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        Random rand = new Random();
        int points=0;
        int questioncount=10;
        int signNumber;
        int num1;
        int num2;
        int wrong=0;
        int right=0;
        double answer=0.0;
        double input=0.0;

        //loop the program 10 times

        
        //generate a math expression
        for(int i=0;i<11;i++){
            signNumber = rand.nextInt(4);   //0-3
            num1 = (int)(Math.random()*100);
            num2 = rand.nextInt(100)+1;    //1-100
            if(wrong+right == 10){
                if(right == 0){
                    System.out.println("You got an 0%. Do better!");
                }
                else if(wrong == 0){
                    System.out.println("You got an 100%. GREAT JOB!");
                }
                else{
                    double accuracy=0.0;
                    accuracy = right*10;
                    System.out.println("You got an "+accuracy+"%."); 
                }
            }
            else{
                if(signNumber==0){
                    System.out.printf("What is %d / %d? ",num1,num2);
                    answer = (double)num1/num2;
                }
                else if(signNumber==1){
                    System.out.printf("What is %d * %d? ",num1,num2);
                    answer = (double)num1*num2;
                }
                else if(signNumber==2){
                    System.out.printf("What is %d + %d? ",num1,num2);
                    answer = (double)num1+num2;
                }
                else{
                    System.out.printf("What is %d - %d? ",num1,num2);
                    answer = (double)num1-num2;
                }
                input = ui.nextDouble();
                //check to see if the user answered the expression correctly
                if(input==answer){
                    System.out.println("Great job! That's correct!");
                    points++;
                    right++;

                }
                else{
                    System.out.printf("Ooo so close, the answer was %f",answer);
                    wrong++;
                }
            }
        }

        //output their points


    }
}