import java.util.*;
import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {

		//Declaring variables
		String word, reverse= "";
		
		//Scanner
		Scanner in = new Scanner(System.in);
		
		//Display for input
		System.out.println("Enter the word to check if it is a palindrome");
		word = in.nextLine();
		
		int length = word.length();
		
		//Loop to check the word letter by letter
		for(int i = length - 1 ; i>= 0; i--) {
			reverse = reverse + word.charAt(i);
			
			
		}
		//Tell the user if the word is a palindrome 
		if(word.equals(reverse)) {
			System.out.println("The word is a palindrome");
		}
		
		else {
			System.out.println("The word is not a palindrome");
		}
		

	}
}
