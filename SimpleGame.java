import java.util.*;



public class SimpleGame{

	public static void main(String[] args) {
		
		System.out.println("This is sample game with java!");
		ask();
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
	 
			if(x == 1) {
				System.out.println("You added a shield to your character.");
				ask();
				x = input.nextInt();
			}
			
			if(x == 2) {
				System.out.println("You added more armor to your character.");
				ask();
				x = input.nextInt();
			}
			
			if(x == 3) {
				System.out.println("You added a sword to your character.");
				ask();
				x = input.nextInt();
			}
			
			if(x == 0) {
				System.out.println("Bye!!");
			}
	    
	}
	
	public static void ask() {
		System.out.println("Please select the things that you want to your character.");
		System.out.println("1. Shield \n"
				+ "2. Armor \n"
				+ "3. Sword \n"
				+ "0. Exit");
		
	}
	
	 
}
