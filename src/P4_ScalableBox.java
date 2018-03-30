
/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P4_ScalableBox {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String str, output;
		int times;

		Scanner input = new Scanner(System.in);

		System.out.print("HOW TALL? ");

		str = input.nextLine();

		System.out.println("HOW WIDE? ");

		times = input.nextInt();

		drawBoxCap(str);
		drawBoxInsides(times);
		drawBoxCap(str);
	}

	public static void drawBoxCap(String str) {
		System.out.print("+");

		for (int capDashIndex = 1; capDashIndex <= 8 - 2; capDashIndex++) {
			System.out.print("-");
		}

		System.out.println("+");
	}

	public static void drawBoxInsides(int i) {
		for (int insideRowIndex = 1; insideRowIndex <= 10 - 2; insideRowIndex++) {
			drawBoxInsideLine();
		}
	}

	public static void drawBoxInsideLine() {
		System.out.print("|");

		for (int insideRowIndex = 1; insideRowIndex <= 8 - 2; insideRowIndex++) {
			System.out.print(".");
		}

		System.out.println("|");
	}

}
