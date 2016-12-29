//Decimal to binary

import java.util.Scanner;

public class DecimalToBinary
{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner(System.in);
    
    
    //DECIMAL TO BINARY******
    int number = -1;
    while(number <= 0)
    {
      System.out.println("Please enter a positive integer: ");
      
      while( ! scan.hasNextInt() )
      {
        String garbage = scan.nextLine();
        System.out.println("Please enter a positive integer: ");
      }
      number = scan.nextInt();
      scan.nextLine();
    }
    //System.out.println("You entered " + number);
    int num = number;
    String binary = "";
    while(num > 0)
    {
      int numMod = num % 2;
      binary = "" + numMod + binary;
      num = (num - numMod) / 2;
    }
    System.out.println(number + " is " + binary + " in binary.");
    
  }
}



