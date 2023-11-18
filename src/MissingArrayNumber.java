import java.util.Arrays;
import java.util.stream.IntStream;

public final class MissingArrayNumber {

    public static int getMissingArrayNumber(int[] arr) {
        Arrays.sort(arr);

        return IntStream.range(1, arr.length)
                .filter(i -> arr[i] - arr[i - 1] > 1)
                .map(i -> arr[i - 1] + 1)
                .findFirst()
                .orElseThrow(() -> new ArithmeticException("There is no missing element"));
    }

    public static int getMissingArrayNumber_AnotherSolution(int[] arr) {
        checkIfArrayIsEmptyOrHasOneElement(arr);

        Arrays.sort(arr);

        int missingNumber = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                missingNumber = arr[i - 1] + 1;
                break;
            }
        }

        if (missingNumber == 0) {
            throw new ArithmeticException("There is no missing element");
        }

        return missingNumber;
    }

    private static void checkIfArrayIsEmptyOrHasOneElement(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            throw new ArithmeticException("There is no missing element");
        }
    }
}
