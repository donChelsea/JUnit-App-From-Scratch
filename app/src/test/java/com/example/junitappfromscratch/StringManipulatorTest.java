package com.example.junitappfromscratch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringManipulatorTest {
    StringManipulator stringManipulator;

    @Before
    public void setUp() throws Exception {
        stringManipulator = new StringManipulator().getInstance();
    }

    @Test
    public void check_less_than_10_with_empty_input() {
        String testString = "";

        boolean result = stringManipulator.isLessThan10(testString);

        Assert.assertTrue(result);
    }

    @Test
    public void check_less_than_10_with_true_input() {
        String testString = "greater than";

        boolean result = stringManipulator.isLessThan10(testString);

        Assert.assertFalse(result);
    }

    @Test
    public void check_is_odd_length_with_empty_input() {
        String testString = "";

        boolean result = stringManipulator.isOddLength(testString);

        Assert.assertFalse(result);
    }

    @Test
    public void check_is_odd_length_with_valid_input() {
        String testString = "great";

        boolean result = stringManipulator.isOddLength(testString);

        Assert.assertTrue(result);
    }

/*    @Test
    public void check_zipper_words_with_valid_input() {
        String testFirst = "apple";
        String testSecond = "orange";

        String expected = "aoprpalnege";

        String result = stringManipulator.zipperWords(testFirst, testSecond);

        Assert.assertEquals(expected, result);
    }*/

    @Test
    public void check_deconstructed_word_with_valid_input() {
        String testString = "goodbye";

        String expected = "gdby ooe";

        String result = stringManipulator.deconstructedWord(testString);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_deconstructed_word_with_empty_input() {
        String testString = "";

        String expected = "";

        String result = stringManipulator.deconstructedWord(testString);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_word_sum_with_valid_input() {
        String testFirst = "first";
        String testSecond = "second";

        int expected = 11;

        int result = stringManipulator.wordSum(testFirst, testSecond);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_word_sum_with_empty_input() {
        String testFirst = "";
        String testSecond = "";

        int expected = 0;

        int result = stringManipulator.wordSum(testFirst, testSecond);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_longest_word_valid_input() {
        String[] testArray = new String[]{"i", "like", "candy"};

        String expected = "candy";

        String result = stringManipulator.longestWord(testArray);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_word_sort_with_valid_input() {
        String[] testArray = new String[]{"i", "candy", "like"};

        String[] expected = new String[]{"i", "like", "candy"};

        String[] result = stringManipulator.wordSort(testArray);

        Assert.assertEquals(expected, result);
    }

    @After
    public void tearDown() throws Exception {
        stringManipulator = null;
    }
}
