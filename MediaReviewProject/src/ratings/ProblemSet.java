package ratings;

import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet {


    public static double average(ArrayList<Double> numbers) {
        if(numbers.size() == 0 )
            return 0.0;
         double sum = 0;
         int length = numbers.size();
         for(int i = 0; i < length; i++ ){
             sum += numbers.get(i);
         }
        return sum / length;

        // TODO: Implement this method to return the average of all the numbers in the input ArrayList
        //       If the ArrayList is empty, return 0.0
        //
        // Examples
        // [1.0,2.0,3.0] returns 2.0
        // [-5.0,5.0] returns 0.0
        // [6.5,6.5,8.5,8.5] returns 7.5
        // [] returns 0.0

    }


    // TODO: Write a public static method named sumOfDigits that takes an int as a parameter and
    //       returns the sum of the digits of the input as an int
    //
    // Examples
    // 123 returns 6
    // 57 returns 12
    // -36 returns 9
    public static int sumOfDigits(int number){
        int sum = 0;
        number = Math.abs(number);
        while(number > 0 ){
            sum += number %10;
            number = number/10;

        }
        return sum;
    }

    // TODO: Write a public static method named bestKey that takes a HashMap of String to Integer
    //       as a parameter and returns a key mapping to the largest Integer. Ties can be broken arbitrarily.
    //       If the HashMap is empty, return the empty String
    //
    // Examples
    // {"CSE": 100, "MTH": 90, "MGT": 10} returns "CSE"
    // {"cat": 5, "dog": 5, "fox": 4} can return either "cat" or "dog"
    // {} returns ""
    public static String bestKey(HashMap <String, Integer> map ){
        String HighestKey = "";
        if(map.isEmpty()){
            return HighestKey;
        }
        int HighestNumber = Integer.MIN_VALUE;
        for(String currentKey :map.keySet() ){
            if (map.get(currentKey) > HighestNumber){
                HighestNumber = map.get(currentKey);
                HighestKey = currentKey;

            }
        }
        return HighestKey;

    }
}
