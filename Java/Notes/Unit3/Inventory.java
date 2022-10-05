import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	public static void main(String[] args){
		//manage and inventory
		//  	you can add, insert, remove, replace, clear the db
		//  	quit --> ends the program
		ArrayList<String> iceCreamList = new ArrayList<String>();

		Scanner in = new Scanner(System.in);
		String input="";


		while(!input.equals("q")){
			System.out.println(iceCreamList);
			System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear or (q)uit?");
			input = in.nextLine();

			if(input.equals("a")){
				System.out.println("WhatFlavor? ");
				input = in.nextLine();
				iceCreamList.add(input);
			}
			else if(input.equals("i")){
				//double check the user puts in correct index ir no OutOfBounds
				System.out.println("Enter an iceCream: ");
				input = in.nextLine();
				System.out.print("Enter a pos: ")
				pos = in.nextInt();
				//add(position, item)
				if(pos>0 && pos<iceCreamList.size()){
					iceCreamList.add(pos-1,input);
				}
			}
			else if(input.equals("p")){
				System.out.println("Enter an iceCream: ");
				input = in.nextLine();
				System.out.print("Enter a pos: ")
				pos = in.nextInt();
				//add(position, item)
				if(pos>0 && pos<iceCreamList.size()){
					iceCreamList.add(pos-1,input);
				}
			}
			else if(input.equals("c")){
				System.out.println("WhatFlavor? ");
				input = in.nextLine();
				if (input.equals("yes")){
					iceCreamList.add(input);
				}
			}
		}
	}
}
