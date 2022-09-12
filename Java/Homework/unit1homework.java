import java.util.Scanner;

public class unit1homework {
    public static void main(String[] args){
        double miles;
        Scanner ui = new Scanner(System.in);
        System.out.println("Please enter ammount of miles: ");
        miles = ui.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println(kilometers + " Kilometers");

        //Calculate Energy
        double kgwater,initialtemp,finaltemp;
        System.out.println("Please enter ammount of water in kg: ");
        kgwater = ui.nextDouble();
        System.out.println("Enter initial tempreature: ");
        initialtemp = ui.nextDouble();
        System.out.println("Enter the final tempreature: ");
        finaltemp = ui.nextDouble(); 
        System.out.println(kgwater *(finaltemp - initialtemp) * 4184);

        /*FutureInvestment
        double investamt,interestrate,numyears,val;
        System.out.println("Enter investment ammount: ");
        investamt = ui.nextDouble();
        System.out.println("Enter anual interest rate in percentage: ");
        interestrate = ui.nextDouble();
        System.out.println("Enter number of years: ");
        numyears = ui.nextDouble(); 
        for (int i=0; i <= numyears; i++) {
            val = numyears * (1+interestrate);
        }
        System.out.println(investamt * val * 12);
        */

        //Driving Cost
        double drivingdist,mpg,ppg;
        System.out.println("Enter driving distance: ");
        drivingdist = ui.nextDouble();
        System.out.println("Enter miles per gallon: ");
        mpg = ui.nextDouble();
        System.out.println("Enter price per gallon: ");
        ppg = ui.nextDouble(); 
        System.out.println(drivingdist / mpg * ppg);
    }
}
