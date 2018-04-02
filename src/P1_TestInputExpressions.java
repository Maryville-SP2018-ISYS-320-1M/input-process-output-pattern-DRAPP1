// ISYS 320
// Name(s):Dave Rapp
// Date: 3-27-18


 // Your expected results after the input is provided:
 
 // 1.) nothing the code doesn't return anything
 // 2.) nothing the code doesn't return anything
 // 3.) nothing the code doesn't return anything
 // 4.) An error since it doesn't take in strings
 
 // 5.) An error since it doesn't return a computation
 // 6.) An error since it doesn't return a computation 
 // 7.) An error since it doesn't take in strings 
 // 8.) nothing the code doesn't return anything

import java.util.Scanner;

public class P1_TestInputExpressions {

	public static void main(String[] args) {
		
		System.out.print("How much money do you have? "); 
		Scanner console = new Scanner(System.in); 
		
		double money = console.nextDouble(); 
		 System.out.println(money*2);
		

	}

}
