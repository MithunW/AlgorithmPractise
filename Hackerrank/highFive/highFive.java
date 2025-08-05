/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

import org.apache.commons.lang3.ArrayUtils;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {

  public static List<int[]> highFive(int[][] marks){
    HashMap<Integer,PriorityQueue<Integer>> scores = new HashMap<Integer,PriorityQueue<Integer>>();
    for (int[] i : marks){
      int key = i[0];
      int score = i[1];
      scores.computeIfAbsent(key, k->new PriorityQueue<Integer>()).add(score);

      if (scores.get(key).size()>5){
        scores.get(key).poll();
      }
      

      }
    int[][] averages = new int[scores.keySet().size()][2];
    int index=0;
    Set<Integer> keySet = scores.keySet();
      for(int r: keySet){
        PriorityQueue<Integer> heap = scores.get(r);
        int sum=0;
        for(int score : heap){
          sum+=score;
        }
        int average=sum/5;
        averages[index][0]=r;
        averages[index][1]=average;


      }
      Arrays.sort(averages, Comparator.comparingInt(a->a[0]));
      return Arrays.asList(averages);

      
      

    }



  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());

    for (String string : strings) {
      System.out.println(string);
    }
  }
}
