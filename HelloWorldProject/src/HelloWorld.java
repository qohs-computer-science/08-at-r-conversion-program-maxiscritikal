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
		
		String binary = "";
		int decimal = 0;

		int x = 0;
		while (x < 1)
		{
			System.out.println("Welcome!  You have the following options: /n 1. Binary to Decimal /n 2. Decimal to Binary");
			int input = in.nextInt();

			if (input == 1)
			{
				x++;
				
			}

			else if (input == 2)
			{
				x++;
				
			}

			else
			{
				System.out.println("Enter 1 or 2 based on the options given.");
			}
		}
		
		System.out.println("Okay now enter a decimal number from 0 - 127:");
		int tempDec = in.nextInt();
		decimal = tempDec;


		in.close();
	}

	public static String decToBin() {
		String temp = "hello";
		return temp;
	}

	public static int binToDec() {
		int temp = 5;
		return temp;
	}

}

