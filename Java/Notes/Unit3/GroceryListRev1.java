package Notes.Unit3;

import java.util.Scanner;

public class GroceryListRev1 {

    public static void main(String[] args){
        //Build a grocery list

        //String[] groceryList = {}; no no, length of 0
        //Define an empty array, need to define the length
        Scanner ui = new Scanner(System.in);
        int howmany = ui.nextInt();

        GroceryItem[] groceryList = new GroceryItem[howmany];

        for(int i=0;i<groceryList.length;i++){
            System.out.println("Name: ");
            String name=ui.nextLine();
            System.out.println("Cost: ");
            double cost=ui.nextDouble();

            groceryList[i] = new GroceryItem(name, cost);

        }
        printArray(groceryList);
    }

    private static void printArray(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void printArray(GroceryItem[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void printHorizontalArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
            System.out.print(arr[i] + ",");
            }
            else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }
}