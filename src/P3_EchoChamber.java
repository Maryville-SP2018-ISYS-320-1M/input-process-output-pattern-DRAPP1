
/*
	ISYS 320
	Name(s):Dave Rapp
	Date: 3-27-18
*/
import java.util.Scanner;
import java.io.*;

public class P3_EchoChamber {

	public static void main(String[] args) {

		String str, output;
		int times;

		Scanner input = new Scanner(System.in);

		System.out.print("What Is Your Phrase? ");

		str = input.nextLine();

		System.out.println("How Many times Should I Repeat It? ");
		times = input.nextInt();

		output = rep1(str, times);
		
		System.out.println( "" +output+ "" );
	}

	public static String rep1(String str, int times) {
		String newStr = "";
		
		if (times <= 0)
			return newStr;
		else {
			for (int i = 1; i <= times;i++)
				newStr = newStr + str;
			return newStr;
		}

	}

}
