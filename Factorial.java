import java.util.*;


public class Factorial {


	
	public static void main(String[] args) {
		//Declare variables
		int factorialnum;
		
		
		System.out.println("This program calculates factorial numbers!");
		System.out.print("Please enter the factorial # you want to use: ");
		
		//get input from the user 
		Scanner input = new Scanner(System.in);
		factorialnum = input.nextInt();
		
		//calls the factorial method 
		int result = factorial(factorialnum);
		
		//Display the result to the user 
		System.out.println(factorialnum +"! Factorial = "+ result);

	}
	
	static  int factorial(int f) {
		
		//Calculates the factorial numbers to the user 
		if(f != 0) {
			return f * factorial(f -1);
		}
		else 
			return 1;
	}

	
}
