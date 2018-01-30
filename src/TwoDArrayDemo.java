

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
		
//		//print the 2D array data
//		for(int r = 0; r < table.length; r++) {
//			//sub-row
//			for(int c = 0; c < table[r].length; c++) {
//				System.out.print(table[r][c] + "\t");
//			}
//			System.out.println();
//		}
		
		//Snake through the data
		for(int r = 0; r < table.length; r++) {
			if(r % 2 == 0) {
				for(int c = 0; c < table[r].length; c++) {
				System.out.print(table[r][c] + "\t");
			}
			System.out.println();
				}
			else {
				for(int c = table[r].length - 1; c >= 0; c--) {
					System.out.print(table[r][c] + "\t");
				}
				System.out.println();
				
			}
		}
		
	}

}
