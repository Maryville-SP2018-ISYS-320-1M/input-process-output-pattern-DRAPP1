/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P4_ScalableBox {
	Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		drawBoxCap(10);
		drawBoxInsides(10);
		drawBoxCap(10);
	}
	
	public static void drawBoxCap(int i ) {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= 8 - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides(int i  ) {
		for( int insideRowIndex = 1; insideRowIndex <= 10 - 2; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine(  ) {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= 8 - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
