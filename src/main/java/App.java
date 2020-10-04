import algorithms.*;

public class App {

    public static void main(String[] args) {
/*        BinarySearch binarySearch = new BinarySearch();
        int[] testArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Result: " + binarySearch.binarySearch(2, testArr));*/

/*        Fibonacci fib = new Fibonacci();
        int n = 10;
        int[] mem = new int[n + 1];
        System.out.println("Fib of " + n + ": " + fib.getFibOf(n, mem));*/

/*        GridPaths paths = new GridPaths();
        int[][] grid = {{0, 0, 0}, {0, 0, 0}, {0, 1, 0}};
        System.out.println(paths.pathCount(grid));*/

/*        SudokuSolver sudokuSolver = new SudokuSolver();
        int[][] sudokuBoard1 =
                {
                        {1, 0, 2, 0, 9, 0, 0, 0, 0},
                        {5, 0, 0, 0, 0, 7, 3, 1, 8},
                        {4, 3, 0, 8, 0, 0, 2, 5, 9},
                        {0, 1, 0, 7, 8, 0, 0, 0, 0},
                        {0, 0, 0, 6, 4, 0, 9, 0, 0},
                        {0, 0, 9, 3, 0, 5, 7, 2, 4},
                        {0, 0, 0, 0, 3, 6, 1, 0, 0},
                        {0, 0, 1, 0, 7, 8, 5, 0, 0},
                        {9, 0, 0, 0, 0, 0, 8, 0, 7}
                };

        SudokuMaker sudokuMaker = new SudokuMaker();
        int[][] sudokuBoard2 = sudokuMaker.makeBoard(123456789);
        System.out.println("\nDoes the board have 1 solution? " + sudokuSolver.oneSolution(sudokuBoard2) + ":");

        System.out.println("Before: ");
        print2dArr(sudokuBoard2);
        System.out.println("\nIs board solvable? " + sudokuSolver.solveSudoku(sudokuBoard2) + ":");
        print2dArr(sudokuBoard2);*/

/*        NQueens nQueens = new NQueens();
        int[][] queenBoard = nQueens.solveQueens(4);
        System.out.println("At end:");
        print2dArr(queenBoard);*/

        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.solveHanoi(4);
    }

    public static void print2dArr(int[][] toPrint) {
        for (int[] ints : toPrint) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
