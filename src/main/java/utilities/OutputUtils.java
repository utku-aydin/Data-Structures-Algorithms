package utilities;

import java.util.Arrays;

public class OutputUtils {

    public void printInt(Integer integer) {
        System.out.printf("Result: %d\n", integer);
    }

    public void printArray(Object[] arr) {
        System.out.printf("Array: %s\n", Arrays.toString(arr));
    }

}
