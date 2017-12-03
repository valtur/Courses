package by.part1.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeWork4 {

   public static Long LuckyNumber(long n){
        List<Long> digits = new ArrayList<Long>();
        Long result;
        while(n>0){
            digits.add(n%10);
            n/=10;
        }
            long sum = 0;
       for(int i=0;i<digits.size();i++) {
           sum += digits.get(i);
       }
        if(sum<10)
            return sum;

        result = LuckyNumber(sum);
        return result;
    }

  //  Complete the program which takes date in number format and then makes its addition of the digits until
// the last digit remains single and the print the number as lucky number.
// example if input is 777 then 7+7+7 =21 = 2+1 =3 so the answer is 3.
  public static void main(String[] args) {
      long date = new Date().getTime();
      String number = String.valueOf(date);
      System.out.println("Date in number format: "+number);
      System.out.print("Lucky number: "+LuckyNumber(date));
  }
}
