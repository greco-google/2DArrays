package MagicSquares;

import java.util.Scanner;

public class Square
{
    int[][] square;
    int row;
    int col;
    int lastRow;
    int lastCol;
    int matrixSize;

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
    	Scanner input = new Scanner(System.in);
	    System.out.println("Enter the size of an array:");
	    Scanner user = new Scanner(System.in);
	    int size1 =user.nextInt();
	    
    	square = new int[size1][size1];
    	row = 0;
    	col = size1 / 2;
    	matrixSize = size1 * size1;
    	square[row][col] = 1;

    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
    		System.out.println("The Magic Square for " + row + ":");
        System.out.println("Sum of each row or column " + row * (row * row + 1) / 2 + ":");
        for(int i = 0; i < row; i++){
        	
			for(int col = 0; col < row; col++)
				
			System.out.print(sumRow(row)+" ");
			System.out.println();
        }
		return row;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col) {
        		System.out.println("The Magic Square for " + col + ":");
            System.out.println("Sum of each row or column " + col * (col * col + 1) / 2 + ":");
            for(int i = 0; i < col; i++){
            	
    			for(int row = 0; row < col; col++)
    				
    			System.out.print(sumRow(col)+" ");
    			System.out.println();
            }
    		return col;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
//I dont know w
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {

    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {

    }

    //--------------------------------------
    //read info into the square from the input stream associated with the 
    //Scanner parameter
    //--------------------------------------
    public void readSquare(Scanner scan)
    {
      for (int row = 0; row < square.length; row++)
	  for (int col = 0; col < square.length; col ++)
	    square[row][col] = scan.nextInt();
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {

    }

}
