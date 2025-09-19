/*
 * Max Korsa
 * 9/17/25
 * PD: 4
 * This program will ask the user what type of conversion they want to perform, either Binary to Decimal or Decimal to Binary.
 *   	 If they enter a choice that is not one that is given, ask them again until they give a valid input. Then output the converted number. And finally it will ask the user if they want to convert another number.
 */

import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String binary = "";
		int decimal = 0;

		boolean runAgain = true;
		while (runAgain == true)
		{
			System.out.println("Welcome! You have the following options:" + "\n" + "1. Binary to Decimal" + "\n" + "2. Decimal to Binary");
			int input = in.nextInt();

			if (input == 1)
			{
				runAgain = false;
				System.out.print("Sweet! Now please give me the value of the Binary number that is 1 - 8 charcters in length:");
				in.nextLine();
				String tempBin = in.nextLine();
				binary = tempBin;
				System.out.println(HelloWorld.binToDec(binary));
				System.out.println("Would you like to continue? (1 = yes 2 = no)");
				int continueAgain  = in.nextInt();
				if (continueAgain == 1)
				{
					runAgain = true;
				}//end of if statement
				else
				{
					runAgain = false;
				}//end of else statement
			}//end of if statement

			else if (input == 2)
			{
				runAgain = false;
				System.out.print("Sweet! Now please give me the value of the Decimal number from 0 - 127:");
				int tempDec = in.nextInt();
				decimal = tempDec;
				System.out.println(HelloWorld.decToBin(decimal));
				System.out.println("Would you like to continue? (1 = yes 2 = no)");
				int continueAgain  = in.nextInt();
				if (continueAgain == 1)
				{
					runAgain = true;
				}//end of if statement
				else
				{
					runAgain = false;
				}//end of else statement
			}//end of else if statement

			else
			{
				System.out.println("Enter 1 or 2 based on the options given.");
			}//end of else statement
		}//end of while loop

		in.close();
	}//end of main method

	public static int binToDec(String bin) {
		int binaryAsDecimal = Integer.parseInt(bin);
		int finalReslut = 0;
		for (int i = 0; i < bin.length(); i++)
		{
			int digit = binaryAsDecimal % 10;
			finalReslut += digit * Math.pow(2, i);
			binaryAsDecimal /= 10;
		}//end of for loop
		return finalReslut;
	}//end of binToDec method


	public static String decToBin(int dec) {
		String decimalAsBinary = "";
		int tempComparison = 128;
		for (int x = 0; x < 8; x++)
		{
			if (tempComparison > dec)
			{
				decimalAsBinary = decimalAsBinary + "0";
				tempComparison = tempComparison/2;
			}//end of if statement

			else
			{
				dec = dec - tempComparison;
				decimalAsBinary = decimalAsBinary + "1";
				tempComparison = tempComparison/2;
			}//end of else statement
		}//end of for loop
		return decimalAsBinary; 
	}//end of decToBin method

}//end of HelloWorld class

