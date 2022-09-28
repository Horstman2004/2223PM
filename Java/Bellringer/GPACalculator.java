import java.util.Scanner;

public class GPACalculator {
    public static void main(String [] args){
        Scanner ui = new Scanner(System.in);
        double[] grades = new double[5];

        for(int i=0;i<5;i++){
            double grade = ui.nextDouble();
            grades[i]=grade;
        }

        double total = 0.0;
        for(int i=0;i<5;i++){
            total+=grades[i];
        }

        private static void printArray(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
