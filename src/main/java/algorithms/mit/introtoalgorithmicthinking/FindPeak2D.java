package algorithms.mit.introtoalgorithmicthinking;

import algorithms.interfaces.GeneralAlgorithm;
import utilities.InputUtils;

public class FindPeak2D implements GeneralAlgorithm {

    Integer[][] subject;

    @Override
    public void handleInputs() {
        InputUtils inputUtils = new InputUtils();
        subject = inputUtils.twoDimensionalArrInputUtil();
    }

    @Override
    public void executeAlgorithm() {
        int length = subject.length - 1;
        int midRow = subject.length / 2;
        int midCol;
        while (true) {
            System.out.println("Running");
            midCol = divideSolutionCol(subject[midRow]);
            if (midRow == 0) {
                break;
            }
            if (midRow == length) {
                break;
            }
            if (subject[midRow][midCol] > subject[midRow + 1][midCol] && subject[midRow][midCol] > subject[midRow - 1][midCol]) {
                break;
            }
            if (subject[midRow][midCol] > subject[midRow + 1][midCol])
                midRow -= (midRow + 1) / 2;
            else
                midRow += (length - midRow + 1) / 2;
        }

        System.out.printf("Peak value is: %d, at row %d column %d\n",
                subject[midRow][midCol], midRow, midCol);
    }

    private int divideSolutionCol(Integer[] arr) {
        int length = arr.length - 1;
        int mid = length / 2;
        while (true) {
            if (mid == 0)
                return mid;
            if (mid == length)
                return mid;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return mid;
            if (arr[mid] > arr[mid - 1])
                mid += (length - mid + 1) / 2;
            else
                mid -= (mid + 1) / 2;
            System.out.printf("Mid: %d\n", mid);
        }
    }
}
