/**
 * 200. Number of Islands
 * <p>
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * <a href="https://leetcode.com/problems/number-of-islands/description/">...</a>
 */
public class Problem200 {
    private final static char GROUND = '1';
    private final static char WATER = '0';
    private final static char VISITED = 'x';

    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == GROUND) {
                    markIsland(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void markIsland(char[][] grid, int i, int j) {
        grid[i][j] = VISITED;
        if (isGroundNeighbour(grid, i, j, i - 1, j)) {
            markIsland(grid, i - 1, j);
        }
        if (isGroundNeighbour(grid, i, j, i + 1, j)) {
            markIsland(grid, i + 1, j);
        }
        if (isGroundNeighbour(grid, i, j, i, j - 1)) {
            markIsland(grid, i, j - 1);
        }
        if (isGroundNeighbour(grid, i, j, i, j + 1)) {
            markIsland(grid, i, j + 1);
        }
    }

    private boolean isGroundNeighbour(char[][] grid, int i, int j, int nI, int nJ) {
        if (nI >= 0 && nI < grid.length && nJ >= 0 && nJ < grid[i].length) {
            return grid[nI][nJ] == GROUND;
        }
        return false;

    }
}
