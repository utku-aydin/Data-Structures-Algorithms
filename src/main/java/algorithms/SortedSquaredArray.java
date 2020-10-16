package algorithms;

public class SortedSquaredArray {
    
    public int[] sortedSquared(int[] input) {
        int[] output = new int[input.length];
        int leftMarker = 0;
        int rightMarker = input.length - 1;
        for (int i = input.length - 1; i >= 0; i--) {
            if (Math.abs(input[leftMarker]) > Math.abs(input[rightMarker])) {
                output[i] = input[leftMarker] * input[leftMarker];
                leftMarker++;
            } else {
                output[i] = input[rightMarker] * input[rightMarker];
                rightMarker--;
            }
        }

        return output;
    }
    
}
