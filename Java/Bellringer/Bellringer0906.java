import java.util.Scanner;

public class Bellringer0906{
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("What is your username: ");
        String name = ui.nextLine();

        System.out.println("What is your password: ");
        String password = ui.nextLine();

        System.out.printf("Username: "+name, "Password: "+password);
    }
}