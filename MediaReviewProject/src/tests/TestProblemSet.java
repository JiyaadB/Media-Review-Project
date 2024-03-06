package tests;

import org.junit.Test;
import ratings.ProblemSet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class TestProblemSet {

    // TODO: Write testing for all 3 methods of the ratings.ProblemSet class

   public static void main(String args[]){
       ArrayList<Double> list1 = new ArrayList<Double>();
       list1.add(1.0);
       list1.add(2.0);
       list1.add(3.0);

       System.out.println(ProblemSet.average(list1));

       ArrayList<Double> list2 = new ArrayList<Double>();

       System.out.println(ProblemSet.average(list2));

       int sumtest1 = ProblemSet.sumOfDigits(123);
       System.out.println(sumtest1);

       int sumtest2 = ProblemSet.sumOfDigits(-36);
       System.out.println(sumtest2);

       HashMap <String, Integer> map1 = new HashMap<String, Integer>();
       map1.put("CSE",100);
       map1.put("MTH", 90);
       map1.put("MGT", 10);

       System.out.println(ProblemSet.bestKey(map1));

       HashMap <String, Integer> map2 = new HashMap<String, Integer>();
       map2.put("cat", 5);
       map2.put("dog", 5);
       map2.put("fox", 4);

       System.out.println(ProblemSet.bestKey(map2));

       HashMap <String, Integer> map3 = new HashMap<String, Integer>();
       System.out.println(ProblemSet.bestKey(map3));

       // Examples
       // {"CSE": 100, "MTH": 90, "MGT": 10} returns "CSE"
       // {"cat": 5, "dog": 5, "fox": 4} can return either "cat" or "dog"
       // {} returns ""
   }


}

