import java.util.Scanner;

public class RPS{
    //version 1: pvp
    private static void PVP(){
        Scanner ui = new Scanner(System.in);
        Integer pointsU1=0;
        Integer pointsU2=0;
        String u1="";
        String u2="";
        while(pointsU1 < 3 && pointsU2 < 3){
            //user 1 inputs r,p,s
            System.out.println("User 1: Rock Paper Scissors (r,p,s)");
            u1 = ui.nextLine();

            //user2 inputs r,p,s
            System.out.println("User 2: Rock Paper Scissors (r,p,s)");
            u2 = ui.nextLine();

            if(u1.equals("r") && u2.equals("s")         //r beats s 
            || u1.equals("p") && u2.equals("r")         //p beats r
            || u1.equals("s") && u2.equals("p")){       //s beats p
                pointsU1++;
            }
            else{
                pointsU2++;
            }
            
            //who won? or was it a tie?
            if(pointsU1 == 3){
                System.out.println("Great Job! You won User 1");
            }
            else if(pointsU2 == 3){
                System.out.println("Great Job! You won User 2");
            }
            else if(pointsU1 == 3 && pointsU2 == 3){
                System.out.println("It's a tie!");

            }
        } 
        pointsU1=0;
        pointsU2=0;
    }

    //version 2: PVC and C randomly throws r,p,s
    private static void PVC(){
        Scanner ui = new Scanner(System.in);
        Integer pointsU1=0;
        Integer pointsC1=0;
        String u1="";
        String c1="";
        while(pointsU1 < 3 && pointsC1 < 3){
            //user 1 inputs r,p,s
            System.out.println("User 1: Rock Paper Scissors (r,p,s)");
            u1 = ui.nextLine();

            //Computer inputs r,p,s
            Integer randNum=0;
            randNum = (int)(Math.random()*3);
            if(randNum == 1){
                c1 = "r";
                System.out.println("Computer chose: "+c1);
            }
            else if(randNum == 2){
                c1 = "p";
                System.out.println("Computer chose: "+c1);
            }
            else if(randNum == 3){
                c1 = "s";
                System.out.println("Computer chose: "+c1);
            }


            if(u1.equals("r") && c1.equals("s")         //r beats s 
            || u1.equals("p") && c1.equals("r")         //p beats r
            || u1.equals("s") && c1.equals("p")){       //s beats p
                pointsU1++;
            }
            else{
                pointsC1++;
            }
            
            //who won? or was it a tie?
            if(pointsU1 == 3){
                System.out.println("Great Job! You won User 1");
            }
            else if(pointsC1 == 3){
                System.out.println("Computer Won!");
            }
            else if(pointsU1 == 3 && pointsC1 == 3){
                System.out.println("It's a tie!");
            }
        } 
        pointsU1=0;
        pointsC1=0;
    }


    //version 3: Main Menu
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        Integer pvpPVC=0;
        System.out.println("Do you want to play PVP or PVC? (PVP = 1; PVC = 2) ");
        pvpPVC = ui.nextInt();

        if(pvpPVC == 1){
            PVP();
        }
        else if(pvpPVC == 2){
            PVC();
        }
    }
}
