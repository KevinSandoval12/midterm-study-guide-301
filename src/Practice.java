import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.print.DocFlavor.STRING;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return max - min;
    }


    // TODO: Implement the other methods from the study guide AND tests for each one
    public static String longestWord(ArrayList<String> words, String search){
        String longestString = "";
        for (String string : words) {
            if (string.toLowerCase().substring(0,1).equals(search.toLowerCase())
            && string.length() > longestString.length()){
                longestString = string;
            }
        }

        return longestString;
    }

    public static int wordLengthCount(HashSet<String> set, int min, int max){
        int lengthCount = 0;

        for (String str : set) {
            if (str.length() > min && str.length() < max){
                lengthCount++;
            }
            
        }
        return lengthCount;
    }


    public static int evenOddDifference(HashMap<Integer, Integer> map ){
        int evenCount = 0;
        int oddCount = 0;

        for (int key : map.keySet()){
            if (key % 2 == 0){
            evenCount++;
        }
            else {
                oddCount++;
            }
        }

        int dif = oddCount - evenCount;
        if (dif < 0) {
            dif = dif * -1;
        }
        return dif;
    }


    public static int secondLargestNum(HashMap<Integer, Integer> map){
        int secondLargest = 0;
        int largest = 0;

        for (int value : map.values()){
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value < largest) {
                secondLargest = value;
            }
        }
        if (secondLargest == largest) {
            return 0;
        }
        return secondLargest;
    }





    // For each method you are only required to implement it for one of the data
    


    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}