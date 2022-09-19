import java.util.Scanner;

public class Bellringer0919 {
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        String un,pw;
        System.out.println("Enter Username: ");
        un = ui.nextLine();
        System.out.println("Enter Password: ");
        pw = ui.nextLine();

        if(un.equals("admin") && pw.equals("admin")){
            System.out.printf("Welcome ", un);
        }
        else{
            System.out.println("Wrong Credentials");
        }

    }
}
