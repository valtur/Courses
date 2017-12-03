package by.part1.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork6 {
    public static List<Double> Average(ArrayList<Double> nums){
        ArrayList<Double> result = new ArrayList<>();
        double sumPos=0;
        int countPos=0;
        double sumNeg=0;
        int countNeg=0;
        for(int i=0; i<nums.size();i++){
            if(nums.get(i)>0){
                sumPos+=nums.get(i);
                countPos++;
            }else{
                sumNeg+=nums.get(i);
                countNeg++;
            }
        }
        result.add(sumPos/countPos);
        result.add(sumNeg/countNeg);
        return result;
    }

  //  Write a program which takes input integer array which contains positive and negative numbers
// and find out the average of positive and average of negative numbers.
// Example :
// 1.If user gives input 9,-1,-1,-4,1,5,-4,2,-3,1 then output will be :
//      Average of positive numbers: 3.6
//      Average of negative numbers: -2.6
// 2.If user gives input 12,4,-5,4,-7,-2,6,14,-8,10 then output will be
//      Average of positive numbers: 8.33
//      Average of negative numbers: -5.5
  public static void main(String[] args) {
    ArrayList<Double> nums = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    for(int i=0;i<10;i++){
      System.out.print("Input number "+(i+1)+": ");
      nums.add(in.nextDouble());
    }

      System.out.println("Average of positive numbers: "+new BigDecimal(Average(nums).get(0)).setScale(2, RoundingMode.UP).doubleValue());
      System.out.print("Average of negative numbers: "+new BigDecimal(Average(nums).get(1)).setScale(2, RoundingMode.UP).doubleValue());
  }
}
