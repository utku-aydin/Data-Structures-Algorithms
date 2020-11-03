package algorithms.mit.introtoalgorithmicthinking;

import algorithms.interfaces.GeneralAlgorithm;
import utilities.InputUtils;
import utilities.OutputUtils;

public class QuickSort implements GeneralAlgorithm {

    Integer[] subject;

    @Override
    public void handleInputs() {
        InputUtils inputUtils = new InputUtils();
        subject = inputUtils.arrInputUtil();
    }

    @Override
    public void executeAlgorithm() {
        recursiveSolution(0, subject.length - 1, subject.length / 2);
    }

    private void recursiveSolution(int start, int end, int pivot) {
        if (end == start)
            return;

        int newPivot = partition(start, end, subject[pivot]);
        System.out.printf("New pivot position: %d\n", newPivot);
        OutputUtils outputUtils = new OutputUtils();
        outputUtils.printArray(subject);
        if (newPivot == -1)
            return;
        if (newPivot > start)
            recursiveSolution(start, newPivot - 1, start);
        if (newPivot < end)
            recursiveSolution(newPivot + 1, end, newPivot + 1);
    }

    private int partition(int start, int end, int pivot) {
        Integer[] newArr = new Integer[end - start + 1];
        int leftPointer = 0;
        int rightPointer = newArr.length - 1;
        int newPos = 0;
        System.out.printf("Start: %d, End: %d\n", start, end);
        for (int i = start; i <= end; i++) {
            if (subject[i] == pivot)
                continue;
            if (subject[i] < pivot) {
                newArr[leftPointer] = subject[i];
                leftPointer++;
            } else {
                newArr[rightPointer] = subject[i];
                rightPointer--;
            }
        }

        System.out.printf("Newarr length: %d\n", newArr.length);

        if (newArr.length == 0)
            return - 1;

        // Both pointers are pointing to the correct new position now.
        newPos = leftPointer;
        System.out.printf("Left pointer: %d, Right pointer: %d\n", leftPointer, rightPointer);
        newArr[newPos] = pivot;
        System.arraycopy(newArr, 0, subject, start, newArr.length);

        return start + newPos;
    }
}
