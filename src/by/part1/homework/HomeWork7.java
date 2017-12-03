package by.part1.homework;

import java.util.Scanner;

public class HomeWork7 {

  //  Write a program which converts all lowercase letter in a sentence to uppercase.
// Example:
// 1) Consider a sentence "welcome to Programr!" its uppercase conversion is "WELCOME TO PROGRAMR!"
// 2) If user inputs string like "I am a new user of Programr!" it should print "I AM A NEW USER OF PROGRAMR!"
  public static void main(String[] args) {
    System.out.print("Enter string: ");
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    System.out.print(str.toUpperCase());
  }
}
