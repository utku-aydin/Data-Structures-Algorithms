package algorithms.mit.introtoalgorithmicthinking;

public class FindPeak {

    public int findPeak(int[] arr) {
        return divideSolution(arr);
    }

    private int divideSolution(int[] arr) {
        int length = arr.length - 1;
        int mid = arr.length / 2;
        while (true) {
            if (mid == 0) {
                return mid;
            }
            if (mid == arr.length - 1) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return mid;
            if (arr[mid] > arr[mid - 1]) {
                mid += (length - mid) / 2;
            } else {
                mid -= mid / 2;
            }
        }
    }

}
