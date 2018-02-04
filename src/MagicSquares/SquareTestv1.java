package MagicSquares;
import java.util.Scanner;

public class SquareTestv1
{
    public static void main(String[] args) throws IOException
    {
Scanner scan = new Scanner(new File("magicData"));

	int count = 1;                 //count which square we're on
	int size = scan.nextInt();     //size of next square

	//Expecting -1 at bottom of input file
	while (size != -1)
	    {

		//create a new Square of the given size

		//call its read method to read the values of the square

		System.out.println("\n******** Square " + count + " ********");
		//print the square
		System.out.println (magicSquare.Square(size));
		
		//print the sums of its rows
		System.out.println (magicSquare.Square(row));
		
		//print the sums of its columns
		System.out.println (magicSquare.Square(col));
		
		//print the sum of the main diagonal
		System.out.println (magicSquare.Square(sumMainDiag));
		
		//print the sum of the other diagonal
		System.out.println (magicSquare.Square(sumOtherDiag));
		
		//determine and print whether it is a magic square
		System.out.println (magicSquare.Square(magic));
		
		//get size of next square
		size = scan.nextInt();

	    }

   }
}
