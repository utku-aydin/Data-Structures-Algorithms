package algorithms.backtobackswe.dynamicprogramming;

public class MaxSumArray {

    public int maxSum(Integer[] arr) {
        return kadaneSolution(arr);
    }

    private int bruteForceSolution(Integer[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int rollingSum = 0;
            for (int j = i; j < arr.length; j++) {
                rollingSum += arr[j];
                max = Math.max(max, rollingSum);
            }
        }

        return max;
    }

    private int kadaneSolution(Integer[] arr) {
        int max = Integer.MIN_VALUE;
        int rolling = 0;
        for (int j : arr) {
            if (j > rolling + j)
                rolling = j;
            else
                rolling += j;
            if (rolling > max)
                max = rolling;
        }

        return max;
    }

}
