import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

        @Test
    void testMaxDiffPositive() {
        // Arrange
        int[] numbers = {8, 2, 9, 5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(7, actual);
    }

    

    // TODO: Make tests for each problem you solve
    @Test
    void testLongestWordCapAndLowercase() {
        ArrayList<String> words = new ArrayList<>();
        words.add("bOb");
        words.add("KEBIN");
        words.add("bruh");

        String actual = Practice.longestWord(words, "b");

        assertEquals("bruh", actual);

    }

        @Test
    void testLongestWordCap() {
        ArrayList<String> words = new ArrayList<>();
        words.add("BOB");
        words.add("BOMBO");
        words.add("BREADSTICKS FROM OLIVE GARDEN");

        String actual = Practice.longestWord(words, "b");

        assertEquals("BREADSTICKS FROM OLIVE GARDEN", actual);

    }

    @Test
    void testWordLengthCount(){
        HashSet<String> set = new HashSet<>();
        set.add("BOB");
        set.add("BOMBO");
        set.add("BREADSTICKS");

        int actual = Practice.wordLengthCount(set, 4, 6);

        assertEquals(1, actual);
    }

        @Test
    void testWordLengthCountEverything(){
        HashSet<String> set = new HashSet<>();
        set.add("BOB");
        set.add("BOMBO");
        set.add("BREADSTICKS");

        int actual = Practice.wordLengthCount(set, 0, 20);

        assertEquals(3, actual);
    }

    @Test
    void testOddEvenDifferenceAllOdd(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(3, 2);
        map.put(5, 3);
        map.put(7, 4);

        int actual = Practice.evenOddDifference(map);
        assertEquals(4, actual);
    }

        @Test
    void testOddEvenDifferenceMixed(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.put(4, 5);


        int actual = Practice.evenOddDifference(map);
        assertEquals(0, actual);
    }

    @Test
    void testSecondLargestNumAllEquals(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.put(2, 5);
        map.put(3, 5);

        int actual = Practice.secondLargestNum(map);

        assertEquals(0, actual);
    }

        @Test
    void testSecondLargestNumTwoNumbers(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.put(2, 60);


        int actual = Practice.secondLargestNum(map);

        assertEquals(5, actual);
    }






}


