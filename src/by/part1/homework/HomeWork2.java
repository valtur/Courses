package by.part1.homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class HomeWork2 {

  //  Write a program which takes two integers N and M and produces last samples of N of the integers from N-1 to N-M.
// example:
// 1) if user inputs N = 10 M = 4 output will be 9 8 7 6 means it produces last 4 samples from 0 to 10.
// 2) if user inputs N = 5 M = 2 output will be 4 3
  public static void main(String[] args) {
    ArrayList<Integer> range = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    int[] nums = new int[2];
    for(int i=0;i<nums.length;i++){
      System.out.print("Input number "+(i+1)+": ");
      nums[i] = in.nextInt();
    }
      System.out.print("Range between "+Math.max(nums[0],nums[1])+" and "+Math.min(nums[0],nums[1])+" is");
      for(int i=Math.max(nums[0],nums[1])-1; i>Math.min(nums[0],nums[1]);i--){
         range.add(i);
          System.out.print(" "+range.get(Math.max(nums[0],nums[1])-i-1));
      }

  }
}
