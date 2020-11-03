import algorithms.backtobackswe.dynamicprogramming.EggDropper;
import algorithms.backtobackswe.dynamicprogramming.MaxSumArray;
import algorithms.backtobackswe.dynamicprogramming.UniqueBinaryTrees;
import algorithms.interfaces.GeneralAlgorithm;
import algorithms.leetcode.AddBinary;
import algorithms.mit.introtoalgorithmicthinking.*;
import algorithms.traversals.Dijkstra;
import data_structures.Graph;
import utilities.InputUtils;
import utilities.OutputUtils;
import utilities.TimeUtil;

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

/*        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.solveHanoi(8);*/

/*        Graph<String> graph = new Graph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge(1, "B", "A");
        graph.addEdge(1, "A", "C");
        graph.addEdge(1, "A", "D");
        graph.addEdge(1, "A", "E");
        graph.addEdge(1, "E", "F");
        graph.addEdge(1, "E", "D");
        graph.addEdge(1, "E", "G");
        graph.addEdge(1, "E", "H");

        BFS bfs = new BFS(graph);
        bfs.breadthFirstSearch("B");*/
/*        DFS dfs = new DFS(graph);
        dfs.searchDF("B");*/

/*        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        System.out.println(lcs.lcSubsequence("AGGTAB", "GXTXYAB "));*/

/*        int[] testArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        RangeQueryCache rqc = new RangeQueryCache(testArr);
        int start = 5;
        int end = 9;
        System.out.printf("From %d to %d, sum is %d ", start, end, rqc.rqCache(start, end));*/

/*        MaxSumRectangle msr = new MaxSumRectangle();
        int[][] test = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {-1, -2, -3, -4}
        };
        System.out.printf("Max sum is: %d", msr.maxSum(test));*/

/*        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((n1, n2) -> n1.compareTo(n2));
        Integer one = 1;
        Integer two = 2;
        System.out.println("Comp: " + two.compareTo(one));
        for (int i = 10; i >= 0; i--) {
            pq.add(i);
        }

        System.out.printf("Poll: %d", pq.poll());*/
/*
        MaxSumArray msa = new MaxSumArray();
        int[] arr = {-2, 2, 5, -11, 6, 2};
        System.out.printf("Max sum: %d", msa.maxSum(arr));*/

/*        Thread run1 = new Thread(new ThreadTutRunnable());
        Thread run2 = new Thread(new ThreadTutRunnable());

        run1.start();
        run2.start();

        Thread mAnon = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        mAnon.start();*/
/*
        SortedSquaredArray sortSqArr = new SortedSquaredArray();
        int[] testArr = {-10, -4, -1, 2, 3, 8, 11, 23};
        System.out.println("Prior: " + Arrays.toString(testArr) + " Sorted: " + Arrays.toString(sortSqArr.sortedSquared(testArr)));*/
/*
        ParenthesisMatchedStrings parMatchStrings = new ParenthesisMatchedStrings();
        parMatchStrings.parenthesisMatch(3);*/

/*        CountDownsK countDownsK = new CountDownsK();
        countDownsK.countDowns();*/

/*        Graph<String> graph = new Graph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge(1, "B", "A");
        graph.addEdge(1, "A", "C");
        graph.addEdge(1, "A", "D");
        graph.addEdge(1, "A", "E");
        graph.addEdge(1, "E", "F");
        graph.addEdge(1, "E", "D");
        graph.addEdge(1, "E", "G");
        graph.addEdge(1, "E", "H");

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstraSolution(graph, "A", "H ");*/
/*
        EggDropper eggDropper = new EggDropper();
        eggDropper.SolveEggDrop(10, 100, 50);*/
/*
        int[] testArr = {1,2,3,4,5,4,3,2,1};
        FindPeak findPeak = new FindPeak();
        System.out.printf("Result: %d", findPeak.findPeak(testArr));*/
/*
        MaxSumArray maxSumArray = new MaxSumArray();
        OutputUtils outputUtils = new OutputUtils();
        InputUtils inputUtils = new InputUtils();

        Integer[] temp = inputUtils.arrInputUtil();
        int maxSum = maxSumArray.maxSum(temp);
        System.out.printf("The max sum is: %d", maxSum);*/
        GeneralAlgorithm generalAlgorithm = new AddBinary();
        TimeUtil timeUtil = new TimeUtil();
        timeUtil.runWithTimer(generalAlgorithm);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;

        if (needle.length() == 0)
            return 0;

        if (needle.equals(haystack))
            return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int needLen = needle.length();
            if (haystack.length() < needLen + i)
                return -1;

            if (haystack.substring(i, i + needLen).equals(needle)) {
                System.out.println(i);
                return i;
            }

        }


        return -1;
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
