import java.util.Scanner;
import java.util.random;

public class PasswordGenerator {
    public static void main(String[] args){  
        Scanner ui = new Scanner(System.in);  
        int chars = 0;
        int numbers = 0;
        int specialChar = 0;
        int total;
        System.out.println("Enter how many characters you want.");
        chars = ui.nextInt();
        System.out.println("Enter how many numbers you want.");
        numbers = ui.nextInt();
        System.out.println("Enter how many special characters you want.");
        specialChar = ui.nextInt();
        total = chars+numbers+specialChar
        if(chars > 0 && numbers > 0 && specialChar > 0 && total > 7);
            passwordGenerate(chars,numbers,specialChar);
        else(){
            System.out.println("You need at least 8 total characters. You currently have: "+total);
            main();
        }

    }

    private static Integer PasswordGenerator(Integer chars, numbers, specialChar){
        Int total = (chars+numbers+specialChar);
        for(i=0;i>chars;i++){
            
        }

    }


}
