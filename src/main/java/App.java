import algorithms.BinarySearch;
import algorithms.Fibonacci;
import algorithms.GridPaths;

public class App {

    public static void main(String[] args) {
        /*BinarySearch binarySearch = new BinarySearch();
        int[] testArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Result: " + binarySearch.binarySearch(2, testArr));

        Fibonacci fib = new Fibonacci();
        int n = 10;
        int[] mem = new int[n + 1];
        System.out.println("Fib of " + n + ": " + fib.getFibOf(n, mem));*/

        GridPaths paths = new GridPaths();
        int[][] grid = {{0,0,0},{0,0,0},{0,1,0}};
        System.out.println(paths.pathCount(grid));
    }

}
