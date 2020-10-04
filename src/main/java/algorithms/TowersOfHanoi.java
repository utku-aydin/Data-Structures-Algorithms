package algorithms;

public class TowersOfHanoi {

    public void solveHanoi(int discCount) {
        solveRec(1, 3, discCount);
    }

    private void solveRec(int start, int end, int discCount) {
        if (discCount == 1) {
            System.out.println("Moved disk 1 " +
                    "from " + start + " to " + end);
            return;
        }

        int mid = getDest(start, end);
        solveRec(start, getDest(start, end), discCount - 1);

        System.out.println("Moved disk " + discCount +
                " from " + start + " to " + end);

        solveRec(mid, end, discCount - 1);
    }

    private int getDest(int start, int end) {
        if (start == 1) {
            if (end == 2)
                return 3;
            return 2;
        }

        if (start == 2) {
            if (end == 1)
                return 3;
            return 1;
        }

        if (end == 1)
            return 2;

        return 1;
    }
}
