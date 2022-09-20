import java.util.Scanner;

public class RPS{
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        Integer pointsU1=0,pointsU2=0;
        String u1,u2;
        while(pointsU1 <= 3 || pointsU2 <= 3){
            System.out.println("User 1: Rock Paper Scissors (r,p,s)");
            u1 = ui.nextLine();
            System.out.println("User 2: Rock Paper Scissors (r,p,s)");
            u2 = ui.nextLine();
            if(u1.equals("r") && u2.equals("s") 
            || u1.equals("p") && u2.equals("r") 
            || u1.equals("s") && u2.equals("p")){
                System.out.printf(u1," Beats", u2);
                pointsU1++;
            }
            else{
                System.out.printf(u2," Beats", u1);
                pointsU2++;
            }
        }
        if(pointsU1 > pointsU2){
            System.out.println("Great Job! You won User 1");
        }
        else{
            System.out.println("Great Job! You won User 2");
        }


            

        //user 1 inputs r,p,s
        //user2 inputs r,p,s
        
        //r beats s
        //p beats r
        //s beats p

        //who won? or was it a tie?
    }

    //version 2: PVC and C randomly throws r,p,s

    //version 3: Main Menu
        /*
            Ask the use if they want PVP or PVC
            Depending on what they choose:
                run PVC or PVP
         */

}
