package algorithms.backtobackswe.dynamicprogramming;

public class UniqueBinaryTrees {

    public int uniqueCount(int[] nodes) {
        int sum = 0;
        for (int i = 0; i < nodes.length; i++) {
            sum += recursiveSolution(i, nodes);
        }

        return sum;
    }

    private int recursiveSolution(int index, int[] nodes) {
        int total = 0;
        if (index != 0)
            total += recursiveSolution(index - 1, nodes);
        if (index < nodes.length)
            total += recursiveSolution(index + 1, nodes);
        return 1;
    }

}
