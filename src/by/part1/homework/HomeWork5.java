package by.part1.homework;

import java.util.Scanner;

public class HomeWork5 {
    public static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    public static final String[] tens = {"", "","twenty","thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static String convert(final int n) {
        if (n < 0) {
            return "minus " + convert(-n);
        }
        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }
        if (n < 1000) {
            return units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }
       return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);

    }

  //  Complete the following program which takes input as a number and converts it into string format.
// Initially arrays of string are given just use it for your logic.
// example: Enter the number: 54 Entered number is: fifty four
  public static void main(String[] args) {
    System.out.print("Enter number: ");
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
      if(number==0){
          System.out.print(number+" is zero");
      }else{
         System.out.print(number+" is "+convert(number));
      }
  }
}
