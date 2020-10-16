package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtils {

    public Integer[] arrInputUtil() {
        List<Integer> input = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String inputStr = s.nextLine();
        for (int i = 0; i < inputStr.length(); i++) {
            input.add((int) inputStr.charAt(i));
        }

        return input.toArray(new Integer[0]);
    }

}
