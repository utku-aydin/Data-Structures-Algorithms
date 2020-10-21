package algorithms.mit.introtoalgorithmicthinking;

import algorithms.interfaces.GeneralAlgorithm;
import utilities.InputUtils;
import utilities.OutputUtils;

import java.util.Arrays;

public class MergeSort implements GeneralAlgorithm {
    Integer[] subject;
    @Override
    public void handleInputs() {
        InputUtils inputUtils = new InputUtils();
        subject = inputUtils.arrInputUtil();
    }

    @Override
    public void executeAlgorithm() {
        recursiveSolution(subject, 0, subject.length - 1);
        OutputUtils outputUtils = new OutputUtils();
        outputUtils.printArray(subject);
    }

    private void recursiveSolution(Integer[] arr, int start, int end) {
        if (start == end)
            return;
        if (end - start == 1) {
            mergeArr(arr, start, end, end);
            return;
        }

        recursiveSolution(arr, start, start + (end - start) / 2);
        recursiveSolution(arr, start + (end - start) / 2 + 1, end);
        mergeArr(arr, start, start + (end - start) / 2 + 1, end);
    }

    private void mergeArr(Integer[] arr, int start1, int start2, int end2) {
        int end1 = start2 - 1;
        int marker1 = start1;
        int marker2 = start2;
        int length = end2 - start1 + 1;
        Integer[] sortedArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Sorted Array before: %s\n", Arrays.toString(sortedArr));
            System.out.printf("Array before: %s\n", Arrays.toString(arr));
            if (arr[marker1] < arr[marker2]) {
                sortedArr[i] = arr[marker1];
                marker1++;
            } else {
                sortedArr[i] = arr[marker2];
                marker2++;
            }
            System.out.printf("Sorted Array after: %s\n", Arrays.toString(sortedArr));
            System.out.printf("Array after: %s\n", Arrays.toString(arr));
            if (marker1 > end1 && marker2 <= end2) {
                System.out.println("First copy called at marker 1: " + marker1 + ", marker2: " + marker2);
                System.arraycopy(arr, marker2, sortedArr, i + 1, end2 - marker2 + 1);
                break;
            }
            if (marker2 > end2 && marker1 <= end1) {
                System.out.println("Second copy called");
                System.arraycopy(arr, marker1, sortedArr, i + 1, end1 - marker1 + 1);
                System.out.printf("Sorted arr after copy: %s", Arrays.toString(sortedArr));
                break;
            }

        }
        System.out.printf("Sorted Array before copy: %s\n", Arrays.toString(sortedArr));
        System.arraycopy(sortedArr, 0, arr, start1, length);
    }
}
