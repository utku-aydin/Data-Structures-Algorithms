package algorithms.competitive;

import utilities.InputUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountDownsK {

    public void countDowns() {
        InputUtils inputUtils = new InputUtils();
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        Integer[] arr = inputUtils.arrInputUtil();
        System.out.println(iterativeSolution(k, arr));
    }

    private int iterativeSolution(int k, Integer[] arr) {
        int count = 0;
        int streak = 1;
        int current = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == current - 1) {
                streak++;
                if (streak == k) {
                    count++;
                    streak = 1;
                    if (i < arr.length - 1) {
                        current = arr[i + 1];
                        continue;
                    }
                }
            } else {
                streak = 1;
            }
            current = arr[i];
        }

        return count;
    }
}
