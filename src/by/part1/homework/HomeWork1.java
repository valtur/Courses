package by.part1.homework;

import java.util.Scanner;
import java.lang.Math;

public class HomeWork1 {

  //  The below program takes 2 numbers as input. Modify it to display the greater of the two numbers.
// Note: Write down your logic in between two commented blocks
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] nums = new int[2];
      for(int i=0;i<nums.length;i++){
          System.out.print("Input number "+(i+1)+": ");
          nums[i] = in.nextInt();
      }
      System.out.println(Math.max(nums[0],nums[1])+" gretter then "+Math.min(nums[0],nums[1]));
  }
}
