import org.junit.Test;

import static org.junit.Assert.*;

public class MissingArrayNumberTest {

    @Test
    public void testGetMissingArrayNumber_IfOnlyOneMissingNumber() {
        int[] arr = new int[]{5, 0, 1, 3, 2};
        int expected = 4;
        int actual = MissingArrayNumber.getMissingArrayNumber(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMissingArrayNumber_AnotherSolution_IfOnlyOneMissingNumber() {
        int[] arr = new int[]{5, 0, 1, 3, 2};
        int expected = 4;
        int actual = MissingArrayNumber.getMissingArrayNumber_AnotherSolution(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testMissingArrayNumber_IfMoreThanOneMissingNumber() {
        int[] arr = new int[]{0, 9, 2, 11, 12, 1};
        int expected = 3;
        int actual = MissingArrayNumber.getMissingArrayNumber(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testMissingArrayNumber_AnotherSolution_IfMoreThanOneMissingNumber() {
        int[] arr = new int[]{0, 9, 2, 11, 12, 1};
        int expected = 3;
        int actual = MissingArrayNumber.getMissingArrayNumber_AnotherSolution(arr);
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testMissingArrayNumber_IfThereIsNoMissingNumber() {
        int[] arr = new int[]{5, 3, 2, 1, 0, 4};
        MissingArrayNumber.getMissingArrayNumber(arr);
    }

    @Test(expected = ArithmeticException.class)
    public void testMissingArrayNumber_AnotherSolution_IfThereIsNoMissingNumber() {
        int[] arr = new int[]{5, 3, 2, 1, 0, 4};
        MissingArrayNumber.getMissingArrayNumber_AnotherSolution(arr);
    }

    @Test(expected = ArithmeticException.class)
    public void testMissingArrayNumber_IfArrayHasOneElement() {
        int[] arr = new int[]{1};
        MissingArrayNumber.getMissingArrayNumber(arr);
    }

    @Test(expected = ArithmeticException.class)
    public void testMissingArrayNumber_AnotherSolution_IfArrayHasOneElement() {
        int[] arr = new int[]{1};
        MissingArrayNumber.getMissingArrayNumber_AnotherSolution(arr);
    }

    @Test(expected = ArithmeticException.class)
    public void testMissingArrayNumber_IfArrayIsEmpty() {
        int[] arr = new int[]{};
        MissingArrayNumber.getMissingArrayNumber(arr);
    }

    @Test(expected = ArithmeticException.class)
    public void testMissingArrayNumber_AnotherSolution_IfArrayIsEmpty() {
        int[] arr = new int[]{};
        MissingArrayNumber.getMissingArrayNumber_AnotherSolution(arr);
    }
}