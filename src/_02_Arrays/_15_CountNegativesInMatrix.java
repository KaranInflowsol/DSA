package _02_Arrays;

public class _15_CountNegativesInMatrix {
    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, -1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
    };
        int i = countNegatives(grid);
        System.out.println("-----------> "+i);
    }

    public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int i = rows - 1;
        int j = 0 ;
        int count = 0;

        while (i >= 0 && j < cols) {
            if (grid[i][j] < 0) {
                count += (cols - j); // Count all remaining elements in the row
                i--; // Move up
            } else {
                j++; // Move right
            }
        }
        return count;
    }
}
