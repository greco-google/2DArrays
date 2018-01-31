
public class TwoDArrayLive {

	public static void main(String[] args) {
		
//		int [][]grid = new int[5][6];
//		
//		for(int r = 0; r < grid.length; r++) {
//			for(int c = 0; c < grid[r].length; c++) {
//				grid[r][c] = (int)(Math.random() * 10);
//				System.out.print(grid[r][c] + "\t");
//			}
//			System.out.println();
//		}
		
		int[]nums = {1,2,3,4,5,6,7,8,9};
		
		int [][]grid = new int[3][3];
		int i = 0;

		for(int r = 0; r < grid.length; r++) {
			if(r % 2 == 0) { // if row is even
			for(int c = 0; c < grid[r].length; c++) {
				grid[r][c] = nums[i];
				System.out.print(grid[r][c] + "\t");
				i++;
			}
			}
			else {
				for(int c = grid[r].length - 1; c >= 0; c--) {
					grid[r][c] = nums[i];
					System.out.print(grid[r][c] + "\t");
					i++;
			}
			}
			System.out.println();
			}
		}		
	}

