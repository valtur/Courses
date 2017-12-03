package by.part1.homework;

import java.util.Scanner;

public class HomeWork3 {

  //  Write a program which takes input as string and check if it is palindrome or not.
// If the string and the reverse of string are same then we say string is palindrome.
  public static void main(String[] args) {
    System.out.print("Input string: ");
    Scanner in = new Scanner(System.in);
    String str = in.next();
    String reverse = new StringBuilder(str).reverse().toString();
    if(str.equals(reverse)){
      System.out.print(str+" is palindrome");
    }else{
      System.out.print(str+" isn't polindrome");
    }
  }
}
