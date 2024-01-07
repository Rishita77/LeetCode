public class Number_of_Islands_200 {

    class Solution {
        public int numIslands(char[][] grid) {
            int islandCount = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        exploreIsland(grid, i, j);
                        islandCount++;
                    }
                }
            }

            return islandCount;
        }

        public void exploreIsland(char[][] grid, int row, int col) {
            if (!isValid(grid, row, col) || grid[row][col] == '0') {
                return;
            }

            // Mark the current cell as visited
            grid[row][col] = '0';

            // Explore adjacent cells
            exploreIsland(grid, row, col - 1);
            exploreIsland(grid, row + 1, col);
            exploreIsland(grid, row - 1, col);
            exploreIsland(grid, row, col + 1);
        }

        public boolean isValid(char[][] grid, int row, int col) {
            return row >= 0 && col >= 0 && row < grid.length && col < grid[0].length;
        }
    }

}
