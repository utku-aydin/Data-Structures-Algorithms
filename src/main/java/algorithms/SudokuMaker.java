package algorithms;

import algorithms.backtobackswe.dynamicprogramming.SudokuSolver;

import java.util.Random;

public class SudokuMaker {

    public int[][] makeBoard(int seed) {
        int[][] board = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }

        int current = 0;
        int marker = 0;
        while (seed > 0) {
            current = seed % 10;
            board[0][marker] = current;
            seed = seed / 10;
            marker++;
        }

        return board;
    }

    public int[][] hardenBoard(int removalCount, int[][] board) {
        Random r = new Random();
        SudokuSolver sudokuSolver = new SudokuSolver();
        while (removalCount > 0) {
 //           int current = board[row][column];
 //           board[row][column] = 0;
            if (!nestedUtility(board))
                return board;
            removalCount--;
        }

        return board;
    }

    private boolean nestedUtility(int[][] board) {
        SudokuSolver sudokuSolver = new SudokuSolver();
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                if (sudokuSolver.solveSudoku(board))
                    return true;
            }
        }

        return false;
    }
}
