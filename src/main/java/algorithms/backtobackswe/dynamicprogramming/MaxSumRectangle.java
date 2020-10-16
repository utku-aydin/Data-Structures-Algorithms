package algorithms.backtobackswe.dynamicprogramming;

public class MaxSumRectangle {

    public int maxSum(int[][] rect) {
        return bruteForceSolution(rect);
    }

    private int bruteForceSolution(int[][] rect) {
        int max = 0;
        for (int i = 0; i < rect.length; i++) {
            System.out.println("I is: " + i);
            for (int j = 0; j < rect.length - 1; j++) {
                for (int k = i; k < rect.length; k++) {
                    for (int l = j + 1; l < rect.length; l++) {
                        int current = sumRect(i, j, k, l, rect);
                        if (current > max) {
                            System.out.printf("New max %d at %d %d, %d %d\n", current, i, j, k, l);
                            max = current;
                        }
                    }
                }
            }
        }

        return max;
    }

    private int sumRect(int topLeftRow, int topLeftColumn, int bottomRightRow, int bottomRightColumn, int[][] arr) {
        int sum = 0;
        for (int i = topLeftRow; i <= bottomRightRow; i++) {
            for (int j = topLeftColumn; j <= bottomRightColumn; j++) {
                sum += arr[i][j];
            }
        }

        return sum;
    }

    private int elegantSolution() {
        return 0;
    }

}
