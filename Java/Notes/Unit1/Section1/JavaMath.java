import java.lang.Math;
import java.util.Random;

public class JavaMath {
    public static void main(String[] args){ 
        /*
        // int/int -> into an int
        System.out.println(18/5);
        System.out.println(300000000/5);
        //double/int -> double
        System.out.println(18.0/5);
        System.out.println(18.0/5.0);

        System.out.println(Integer.MAX_VALUE);            
        System.out.println(Double.MAX_VALUE);        
        System.out.println(Long.MAX_VALUE); 
        
        //System.out.println("18"/5);         no no....
        //System.out.println(" "*5);          no no....
        //System.out.println(2**2);           no no....
        System.out.println(Math.pow(10, 5));

        /*
            Double = decimal number, but...
                2 floats put together
        */

        /* 
        System.out.println(6*(2/1)/1);
        System.out.println(6*(2/1.0)/1);

        System.out.println(Math.pow(2,3)/(7/7/8));
        //  8/0
        //  Infinity
        System.out.println(7/8);
        System.out.println(15/16);
        System.out.println(31/32);
        System.out.println(63/64);
        System.out.println(127/128);
        System.out.println(255/256);

        //Remainder or modulo
        System.out.println(255%256);

        System.out.println(9/2);        //4.5 = 4
        System.out.println(10/3);       //3.33333 = 4
        System.out.println(19/10);      //1.9 = 1

        System.out.println(1367/2);
        System.out.println(1367*.5);

        //GOOD RULE OF THUMB: any calculations, include a double

        System.out.println(1367*2);
        System.out.println(1367*2.0);
        */

        //Declare varibles

        int age=17;
        //double age=17;

        //Can't have two varibles named the same

        double years = 12.5;    //data type object - primitive 
        Double year = 12.5;     //class type object - non-primitive

        Integer ages = 17;

        //python increase by 1 use +=1
        //pythong increase by anynumber use +=anynumber

        age++;      //increase by one
        age+=5;     //increae by 5

        age--;      //decrease by one
        age-=5;     //decrease by 5

        age/=5.0;   //still an integer
        age*=5;     //times 5

        //age^=;      //bit calculation

        //System.out.println("age at the end: "+age);


        //Random Numbers!!! Yay!!
        //Option 1 - Math module's randomness

        double randomness = Math.random();
        System.out.println(randomness);

        //random number between 0 and 10
        System.out.println(randomness*10);

        //random number between 0 and 10
        //cast the double to an int
        //casting randomness to an int and multiplying by 10
        System.out.println((int) (randomness*10));

        //random number between 42 - 56
        System.out.println((int) (randomness*(56-42))+42);


        //Option 2 - Random Utility
        Random rand = new Random();

        int randomInt = rand.nextInt(10);
        System.out.println(randomInt);
        double randomDouble = rand.nextDouble();
        System.out.println(randomDouble);
    }

}
