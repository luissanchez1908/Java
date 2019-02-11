import java.util.*;

import java.util.Random;




public class lottery{

	public static void main(String[] args) {
		
		System.out.println("The Lottery Number for today is:");
		
		
		for(int i =0; i< 7; i++) {
			System.out.print(" "+random(0) + " ");
			
		}
	}
	
	 public static int random(int x) {
		 Random random =new Random();
		 int p = random.nextInt(99);
		 return p;
	 }
}
