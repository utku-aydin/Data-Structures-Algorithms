package algorithms;

public class BinarySearch {

    public int binarySearch(int target, int[] arr) {
        System.out.println("Binary Search to be performed.");

        //return recursiveStep(arr, target, 0, arr.length - 1);
        return iterativeSolution(arr, target);
    }

    private int recursiveStep(int[] arr, int target, int left, int right) {
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        System.out.println("Left: " + left + " Right: " + right);
        if (arr[mid] == target) {
            return mid;
        } else if (target > midVal) {
            return recursiveStep(arr, target, mid + 1, right);
        } else {
            return recursiveStep(arr, target, left, mid - 1);
        }
    }

    private int iterativeSolution(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = left + (right - left) / 2;
        System.out.println("Left: " + left + " Right: " + right);
        while (arr[mid] != target) {
            if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            mid = left + (right - left) / 2;
        }

        return mid;
    }

}
