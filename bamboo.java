package bamboo;
import java.util.Scanner;

public class Bamboo {
	public static void main(String[] args) {
		System.out.print("How many rows do you want: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println();
		Print(n);
		
	}
	
	public static void Print(int n) {
		
		for(int i = 0; i< n; i++) {
			
			for (int x= n - i; x>1; x--) {
				System.out.print("  ");
			}
			for (int x= 0; x<=i; x++) {
				System.out.print("|-| ");
			}
			
			
			System.out.println();
			
			
			
		}
	}
		    
}

