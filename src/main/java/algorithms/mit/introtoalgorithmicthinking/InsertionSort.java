package algorithms.mit.introtoalgorithmicthinking;

import algorithms.interfaces.GeneralAlgorithm;
import utilities.InputUtils;
import utilities.OutputUtils;

public class InsertionSort implements GeneralAlgorithm {

    Integer[] subject;
    OutputUtils outputUtils = new OutputUtils();

    @Override
    public void handleInputs() {
        InputUtils inputUtils = new InputUtils();
        subject = inputUtils.arrInputUtil();
        outputUtils.printArray(subject);
    }

    @Override
    public void executeAlgorithm() {
        iterativeSolution(subject);
    }

    private void iterativeSolution(Integer[] arr) {
        Integer[] sortedArr = new Integer[arr.length];
        int marker = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                marker = i;
                while (marker > 0 && arr[marker] < arr[marker - 1]) {
                    temp = arr[marker];
                    arr[marker] = arr[marker - 1];
                    arr[marker - 1] = temp;
                    marker--;
                }

                //shiftArray(sortedArr, i + 1);
            }
        }

        outputUtils.printArray(subject);
    }
    
    private void shiftArray(Integer[] arr, int shiftFrom) {
        if (arr.length - 1 - shiftFrom >= 0)
            System.arraycopy(arr, shiftFrom - 1, arr, shiftFrom, arr.length - 1 - shiftFrom);
    }
}
