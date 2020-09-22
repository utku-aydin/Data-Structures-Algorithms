package algorithms;

public class GridPaths {

    public int pathCount(int[][] grid) {
        int[][] pathCounts = new int[grid.length][grid.length];
        return recursiveSol(grid, pathCounts, 0, 0);
    }

    private int recursiveSol(int[][] grid, int[][] pathCounts, int row, int column) {
        System.out.println("Iteration");
        if (row == grid.length - 1)
            return 1;
        if (column == grid.length - 1)
            return 1;
        int paths = 0;
        if (pathCounts[row][column] != 0) {
            return pathCounts[row][column];
        }
        if (grid[row][column + 1] == 0)
            paths += recursiveSol(grid, pathCounts, row, column + 1);
        if (grid[row + 1][column] == 0)
            paths += recursiveSol(grid, pathCounts, row + 1, column);
        pathCounts[row][column] = paths;
        return paths;
    }

}
