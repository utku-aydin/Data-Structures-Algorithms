package data_structures;

public class Tuple<E, T> {
    private E val1;
    private T val2;

    public Tuple(E val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public E getVal1() {
        return val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal1(E val1) {
        this.val1 = val1;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }
}
