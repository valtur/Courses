package by.part1.homework;

import java.util.*;

public class HomeWork8 {

    public static Map<Integer,Integer> WordLength(String str){
        String[] words;
        ArrayList<Integer> count = new ArrayList<>();
        str=str.replace(","," ").replace("."," ").replace("!"," ").replace("?"," ").replace(":"," ").replace(";"," ").replace("/"," ");
        words=str.replace("  "," ").replace("   ","").replace("    "," ").split(" ");
        for(int i=0;i<words.length;i++){
            count.add(words[i].length());
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer wordl:count){
            if (map.containsKey(wordl)) {
                Integer total = map.get(wordl);
                map.put(wordl, total + 1);
            } else {
                map.put(wordl, 1);
            }
        }
        return map;
    }
  //  Write a program to read English text and print a count of word lengths,
// Example:
// the total number of words of length 1 which occurred, the number of length 2, and so on.
  public static void main(String[] args) {
    System.out.print("Input text: ");
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
        System.out.print("The total number of words of length "+WordLength(str).keySet().toArray()[0]+" is "+WordLength(str).get(WordLength(str).keySet().toArray()[0]));
      for(int i=1;i<WordLength(str).keySet().toArray().length;i++) {
          System.out.print(", the number of length " + WordLength(str).keySet().toArray()[i] + " is " + WordLength(str).get(WordLength(str).keySet().toArray()[i]));
      }

  }
}
