package algorithms;

public class RangeQueryCache {

    int[] array;
    int[] cache;

    public RangeQueryCache(int[] array) {
        this.array = array;
        cache = new int[array.length + 1];
        fillCache();
    }

    /*Query indexes should start at 1, result inclusive*/
    public int rqCache(int start, int end) {
        if (start == 0)
            return cache[end];
        return cache[end] - cache[start - 1];
    }

    private void fillCache() {
        for (int i = 1; i < cache.length; i++) {
            cache[i] = cache[i - 1] + array[i - 1];
        }
    }

}
