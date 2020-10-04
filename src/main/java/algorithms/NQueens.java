package algorithms;

/* Backtracking: method of problem solving by making
 * a series of choices that can be return (backtrack) to.
 * The Call Stack is remembers each function call,
 * and the decision made at each one.
 * No need for queens to fill squares on their own row or on rows above them,
 * as later queens will only be placed below them.
 * However, I've kept this for the visual aspect.*/
public class NQueens {

    public int[][] solveQueens(int n) {
        int[][] board = new int[n][n];
        solveRec(board, n, 0);
        return board;
    }

    private boolean solveRec(int[][] board, int queenCount, int row) {
        if (queenCount == 0)
            return true;

        if (row == board.length) {
            return false;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 0) {
                placeQueen(board, row, i, queenCount);
                queenCount--;
                if (solveRec(board, queenCount, row + 1)) {
                    return true;
                }
                queenCount++;
                removeQueen(board, row, i, queenCount);
            }
        }

        return false;
    }

    public static void print2dArr(int[][] toPrint) {
        for (int[] ints : toPrint) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private void placeQueen(int[][] board, int row, int col, int queenNum) {
        fillRow(board, row, queenNum);
        fillCol(board, col, queenNum);
        fillDiagonal(board, row, col, queenNum);
        System.out.println("Queen at row: " + row);
        print2dArr(board);
    }

    private void removeQueen(int[][] board, int row, int col, int queenNum) {
        emptyRow(board, row, queenNum);
        emptyCol(board, col, queenNum);
        emptyDiagonal(board, row, col, queenNum);
    }

    private void fillRow(int[][] board, int row, int fillWith) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 0)
                board[row][i] = fillWith;
        }
    }

    private void fillCol(int[][] board, int col, int fillWith) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 0)
                board[i][col] = fillWith;
        }
    }

    private void fillDiagonal(int[][] board, int row, int col, int fillWith) {
        fillTopLeft(board, row, col, fillWith);
        fillTopRight(board, row, col, fillWith);
        fillBottomLeft(board, row, col, fillWith);
        fillBottomRight(board, row, col, fillWith);
    }

    private void fillTopLeft(int[][] board, int row, int col, int fillWith) {
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 0)
                board[row][col] = fillWith;
            row--;
            col--;
        }
    }

    private void fillTopRight(int[][] board, int row, int col, int fillWith) {
        while (row >= 0 && col < board.length) {
            if (board[row][col] == 0)
                board[row][col] = fillWith;
            row--;
            col++;
        }
    }

    private void fillBottomLeft(int[][] board, int row, int col, int fillWith) {
        while (row < board.length && col >= 0) {
            if (board[row][col] == 0)
                board[row][col] = fillWith;
            row++;
            col--;
        }
    }

    private void fillBottomRight(int[][] board, int row, int col, int fillWith) {
        while (row < board.length && col < board.length) {
            if (board[row][col] == 0)
                board[row][col] = fillWith;
            row++;
            col++;
        }
    }

    private void emptyRow(int[][] board, int row, int emptyWith) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == emptyWith) {
                board[row][i] = 0;
            }
        }
    }

    private void emptyCol(int[][] board, int col, int emptyWith) {
        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == emptyWith) {
                board[i][col] = 0;
            }
        }
    }

    private void emptyDiagonal(int[][] board, int row, int col, int emptyWith) {
        emptyTopLeft(board, row, col, emptyWith);
        emptyTopRight(board, row, col, emptyWith);
        emptyBottomLeft(board, row, col, emptyWith);
        emptyBottomRight(board, row, col, emptyWith);
    }

    private void emptyTopLeft(int[][] board, int row, int col, int emptyWith) {
        while (row >= 0 && col >= 0) {
            if (board[row][col] == emptyWith) {
                board[row][col] = 0;
            }
            row--;
            col--;
        }
    }

    private void emptyTopRight(int[][] board, int row, int col, int emptyWith) {
        while (row >= 0 && col < board.length) {
            if (board[row][col] == emptyWith) {
                board[row][col] = 0;
            }
            row--;
            col++;
        }
    }

    private void emptyBottomLeft(int[][] board, int row, int col, int emptyWith) {
        while (row < board.length && col >= 0) {
            if (board[row][col] == emptyWith) {
                board[row][col] = 0;
            }
            row++;
            col--;
        }
    }

    private void emptyBottomRight(int[][] board, int row, int col, int emptyWith) {
        while (row < board.length && col < board.length) {
            if (board[row][col] == emptyWith) {
                board[row][col] = 0;
            }
            row++;
            col++;
        }
    }
}
