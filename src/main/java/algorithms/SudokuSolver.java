package algorithms;

import java.util.HashMap;

public class SudokuSolver {

    public boolean solveSudoku(int[][] board) {
        return solve(board, 0, 0);
    }

    public boolean oneSolution(int[][] board) {
        int solCount = countSolutions(board, 0, 0);
        System.out.println("Number of solutions: " + solCount);
        return solCount == 1;
    }

    private int countSolutions(int[][] board, int row, int column) {
        if (column == board.length) {
            if (row == board.length - 1) {
                //print2dArr(board);
                return 1;
            }
            return countSolutions(board, row + 1, 0);
        }

        int total = 0;

        if (board[row][column] == 0) {
            for (int i = 1; i < 10; i++) {
                board[row][column] = i;
                if (validateRow(board[row]) && validateColumn(getColumn(board, column)) && validateSquare(board, row, column)) {
                    total += countSolutions(board, row, column + 1);
                    System.out.println("Total: " + total);
                    if (total > 1)
                        return 2;
                }
            }
            board[row][column] = 0;
            return total;
        } else {
            return countSolutions(board, row, column + 1);
        }
    }

    private boolean solve(int[][] board, int row, int column) {
        if (column == board.length) {
            if (row == board.length - 1) {
                //print2dArr(board);
                return true;
            }
            return solve(board, row + 1, 0);
        }

        if (board[row][column] == 0) {
            for (int i = 1; i < 10; i++) {
                board[row][column] = i;
                if (validateRow(board[row]) && validateColumn(getColumn(board, column)) && validateSquare(board, row, column)) {
                    if (solve(board, row, column + 1))
                        return true;
                }
            }
            board[row][column] = 0;
            return false;
        } else {
            return solve(board, row, column + 1);
        }
    }

    private boolean validateRow(int[] row) {
        HashMap<Integer, Integer> checker = new HashMap<>();
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 0)
                continue;
            if (checker.containsValue(row[i]))
                return false;
            checker.put(i, row[i]);
        }

        return true;
    }

    private boolean validateColumn(int[] column) {
        HashMap<Integer, Integer> checker = new HashMap<>();
        for (int i = 0; i < column.length; i++) {
            if (column[i] == 0)
                continue;
            if (checker.containsValue(column[i]))
                return false;
            checker.put(i, column[i]);
        }

        return true;
    }

    private boolean validateSquare(int[][] board, int row, int column) {
        int i = (row + 1) - (row) % 3 - 1;
        int j = (column + 1) - (column) % 3 - 1;
        HashMap<Integer, Integer> checker = new HashMap<>();
        for (int n = i; n < i + 3; n++) {
            for (int m = j; m < j + 3; m++) {
                if (board[n][m] == 0)
                    continue;
                if (checker.containsValue(board[n][m]))
                    return false;
                checker.put(i, board[n][m]);
            }
        }

        return true;
    }

    private int[] getColumn(int[][] board, int column) {
        int[] col = new int[board.length];

        for (int i = 0; i < board.length; i++) {
            col[i] = board[i][column];
        }

        return col;
    }

    private void print2dArr(int[][] toPrint) {
        for (int[] ints : toPrint) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
