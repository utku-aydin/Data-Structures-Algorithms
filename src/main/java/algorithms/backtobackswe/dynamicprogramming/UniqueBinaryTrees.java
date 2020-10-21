package algorithms.backtobackswe.dynamicprogramming;

import algorithms.interfaces.GeneralAlgorithm;
import utilities.InputUtils;
import utilities.OutputUtils;

public class UniqueBinaryTrees implements GeneralAlgorithm {

    Integer subject;

    @Override
    public void handleInputs() {
        InputUtils inputUtils = new InputUtils();
        subject = inputUtils.integerInputUtil();
    }

    @Override
    public void executeAlgorithm() {
        int result = possibilitiesForSize((int) subject);
        OutputUtils outputUtils = new OutputUtils();
        outputUtils.printInt(result);
    }

    // For each root, there are (recursive) possibilities on the left,
    // and identical/similar results on the right. Each result on the right
    // is matched by all the results on the left, so we must multiply them.
    private int splitSubTreePossibilities(int current, int length) {
        return possibilitiesForSize(current - 1) * possibilitiesForSize(length - current);
    }

    // Called for each possible root. Each root results in a different outcome.
    private int possibilitiesForSize(int size) {
        if (size == 2)
            return 2;

        if (size == 1)
            return 1;

        if (size == 0)
            return 1;

        int total = 0;
        for (int i = 1; i <= size; i++) {
            total += splitSubTreePossibilities(i, size);
        }

        return total;
    }

}
