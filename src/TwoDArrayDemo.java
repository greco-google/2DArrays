

public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		int[][] table = new int[5][10];
		
		//load the 2D array with data
		//r = row
		//c = column
		for(int r = 0; r < table.length; r++) {
			
			//sub-row
			for(int c = 0; c < table[r].length; c++) {
				
				table[r][c] = r * 10 + c;
			}
		}
		
		//print the 2D array data
		for(int r = 0; r < table.length; r++) {
			//sub-row
			for(int c = 0; c < table[r].length; c++) {
				System.out.println(table[r][c]);
			}
		}
	}

}