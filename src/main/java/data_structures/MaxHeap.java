package data_structures;

public class Heap {

    Integer[] heap;

    public Heap(int size) {
        heap = new Integer[size];
    }

    public void put(Integer value) {
        if (heap[0] == null)
            heap[0] = value;
    }

}
