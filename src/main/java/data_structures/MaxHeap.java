package data_structures;

public class MaxHeap {

    Integer[] heap;
    int size;

    public MaxHeap(int length) {
        heap = new Integer[length];
        size = 0;
    }

    public void put(Integer value) {
        if (heap[0] == null) {
            heap[0] = value;
            size++;
            return;
        }
    }

    private void recursiveInsert(Integer value, int index) {

    }

}
