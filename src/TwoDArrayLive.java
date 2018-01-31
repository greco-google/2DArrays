
public class TwoDArrayLive {

	public static void main(String[] args) {
		
		int [][]grid = new int[5][6];
		
		for(int r = 0; r < grid.length; r++) {
			for(int c = 0; c < grid[r].length; c++) {
				grid[r][c] = (int)(Math.random() * 10);
				System.out.print(grid[r][c] + "\t");
			}
			System.out.println();
		}
		

	}

}
