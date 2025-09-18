/*
 * Max Korsa
 * 9/17/25
 * PD: 4
 * This program will ask the user what type of conversion they want to perform, either Binary to Decimal or Decimal to Binary.
 *   	 If they enter a choice that is not one that is given, ask them again until they give a valid input. Then output the converted number.
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
				int continue  = in.nextInt();
				if (continue == 1)
				{
					runAgain = true;
				}
				else
				{
					runAgain = false;
				}
			}

			else if (input == 2)
			{
				runAgain = false;
				System.out.print("Sweet! Now please give me the value of the Decimal number from 0 - 127:");
				in.nextInt();
				int tempDec = in.nextInt();
				decimal = tempDec;
				System.out.println(HelloWorld.decToBin(decimal));
				System.out.println("Would you like to continue? (1 = yes 2 = no)");
				int continue  = in.nextInt();
				if (continue == 1)
				{
					runAgain = true;
				}
				else
				{
					runAgain = false;
				}
			}

			else
			{
				System.out.println("Enter 1 or 2 based on the options given.");
			}
		}

		in.close();
	}

	public static int binToDec(String bin) {
		int temp = 5;



		return temp;
	}


	public static String decToBin(int dec) {
		String temp = "hello";



		return temp;
	}

}

