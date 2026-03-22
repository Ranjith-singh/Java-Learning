package recursion;

public class r3 {

	static void dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ||
            grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;
        dfs(i + 1, j, grid); // checking down
        dfs(i, j + 1, grid); // checking right
        dfs(i, j - 1, grid); // checking left
        dfs(i - 1, j, grid); // checking up
    }

    // Function to count the number of enclaves on the grid
    static int numberOfEnclaves(int[][] grid) {

        int n = grid.length; // number of rows in grid
        int m = grid[0].length; // number of columns in grid

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If the cell is on the edge and contains a 1, call dfs to update adjacent connected cells to 0
                if ((i == 0 || j == 0 || i == n - 1 ||
                    j == m - 1) && grid[i][j] == 1) {
                    dfs(i, j, grid);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count += grid[i][j]; // count the remaining 1s on the grid
            }
        }

        return count; // return the count of enclaves
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][]={{0,1,1,0},
					  {1,1,1,0},
					  {0,1,1,0},
					  {0,0,0,0}};
		System.out.println(numberOfEnclaves(grid));
	}
}
