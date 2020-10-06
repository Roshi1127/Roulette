import java.util.Random;
import java.util.Scanner;

public class Roulette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
	       double total = 500;
	       double amount;
	       int choice, win = 0, lose = 0, spin = 0;
	       int number;
	       int rouletteNumber;
	       int result;
	       char response = 'y';
	       int resultArr[] = new int[36];
	       String player = "";
	       
	       while (response == 'y' || response == 'Y' && total <= 0)
	       {
	    	   System.out.println("Please Enter your name");
	    	   player = input.next();
	           System.out.print(player + " " + "Enter your bet amount: ");
	           amount = input.nextDouble();
	           System.out.print("0 - Even\n1 - Odd\n2 - Number\n");
	           choice = -1;
	           while (choice < 0 || choice > 2)
	           {
	               System.out.print("Place your bet on: ");
	               choice = input.nextInt();
	           }
	           number = 0;
	           if (choice == 2)  
	           {
	               while (number < 1 || number > 36)
	               {
	                   System.out.print(player + " " + "Place your bet on number(1-36): ");
	                   number = input.nextInt();
	               }
	           }
	           rouletteNumber = generator.nextInt(37);
	           spin++;
	           System.out.println("Roulette number: " + rouletteNumber);
	           
	           if (choice == 2)
	           {
	               if (rouletteNumber == number)
	                   result = 35;
	               else
	                   result = 0;
	           }
	           else
	           {
	               if (rouletteNumber == 0 || rouletteNumber % 2 != choice)
	                   result = 0;
	               else
	                   result = 1;
	           }
	       

	}

}
