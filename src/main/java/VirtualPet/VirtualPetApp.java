package VirtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPet myVirtualPet = new VirtualPet(100,100,100);
		String choice = "null";
		do {
		System.out.println("Hi! Im Pookie the blobfish. I'm your pet. Take care of me. ");
		System.out.println("Choose an option");
		System.out.println("Press 1 to feed me");
		System.out.println("Press 2 to play with me");
		System.out.println("Press 3 to clean my stinky, dirty tank");
		System.out.println("Press 4 to exit");
		input.nextLine();
		}
		while(!choice.equals("4"));
		
		
		//else if statement + Sout + myVirtualPet.feed(50)
	input.close();	
	
	}
}
