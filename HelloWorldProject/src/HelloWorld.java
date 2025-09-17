/*
 * TODO: Max Korsa
 * TODO: 9/17/25
 * TODO: PD: 4
 * TODO: This program will ask the user what type of conversion they want to perform, either Binary to Decimal or Decimal to Binary.
 *   	 If they enter a choice that is not one that is given, ask them again until they give a valid input. Then output the converted number.
 * 		  
 * 		 

 */

import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = 0;
		String binary = "";
		int decimal = 0;
		while (x < 1)
		{
			System.out.println("Do you want decimal to binary converstion or the other way around? Enter '1' for decimal to binary and '2' for the other oprion.");
			int input = in.nextInt();

			if (input == 1)
			{
				System.out.println("Okay now enter a decimal number from 0 - 127:");
			}

			else if (input == 2)
			{
				
			}

			else
			{

			}
		}

		in.close();
	}

	public static String decToBin() {
		
	}

	public static int binToDec() {
		
	}

}

