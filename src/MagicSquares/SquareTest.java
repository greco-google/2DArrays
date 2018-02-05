package MagicSquares;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SquareTest
{
//watch video 5:00 min
    public static void main(String[] args) throws IOException
    {
Scanner scan = new Scanner(new File("magicData.txt"));

	int count = 1;                 //count which square we're on
	int size = scan.nextInt();     //size of next square

	//Expecting -1 at bottom of input file
	while (size != -1)
	    {

		//create a new Square of the given size

		Square magicSquare = new Square(size);

		//call its read method to read the values of the square

magicSquare.readSquare(scan);

		System.out.println("\n******** Square " + count + " ********");
		//print the square

		magicSquare.printSquare();

		//print the sums of its rows

		for(int row = 0; row < size; row++) {
			System.out.println("The sum of row #" + row + " is: " + magicSquare.sumRow(row));
}
		//print the sums of its columns

		for(int col = 0; col < size; col++) {
			System.out.println("The sum of col #" + col + " is: " + magicSquare.sumCol(col));
}
		//print the sum of the main diagonal
			System.out.println("The sum of the main Diag is: " + magicSquare.sumMainDiag());

		//print the sum of the other diagonal
			System.out.println("The sum of the other Diag is: " + magicSquare.sumOtherDiag());
		//determine and print whether it is a magic square
		
		if(magicSquare.magic()) {
		System.out.println("Is a MAGIC SQUARE! :)");
	}
		else {
		System.out.println("Is NOT a Magic Square. :(" );
}
		//get size of next square
		size = scan.nextInt();
		count++;

	    }

   }
}

