package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtils {

    public Integer integerInputUtil() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a number: ");
        return s.nextInt();
    }

    public String stringInputUtil() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a string: ");
        return s.nextLine();
    }

    public Integer[] arrInputUtil() {
        List<Integer> input = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Input 1D array: ");
        String inputStr = s.nextLine();
        String[] inputArr = inputStr.split(",");
        for (String value : inputArr) {
            input.add(Integer.valueOf(value));
        }

        return input.toArray(new Integer[0]);
    }

    public Integer[][] twoDimensionalArrInputUtil() {
        List<List<Integer>> input = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String currentInputStr;
        System.out.println("Input 2D array, then 'ok' when done: ");
        while (s.hasNextLine()) {
            currentInputStr = s.nextLine();
            System.out.printf("Current input: %s\n", currentInputStr);
            if (currentInputStr.equals("ok")) {
                System.out.println("Input is ok");
                break;
            }
            List<Integer> currentInputList = new ArrayList<>();
            String[] splitInput = currentInputStr.split(",");
            for (String value : splitInput) {
                currentInputList.add(Integer.valueOf(value));
            }

            input.add(currentInputList);
        }

        Integer[][] result = new Integer[input.size()][input.get(0).size()];
        for (int i = 0; i < input.size(); i++) {
            result[i] = input.get(i).toArray(new Integer[0]);
        }

        return result;
    }

}
