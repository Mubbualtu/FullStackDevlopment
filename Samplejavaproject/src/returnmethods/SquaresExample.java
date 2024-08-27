package returnmethods;

class Squares
{
    int[] calculateSquares()
    {
        int[] squares = new int[100];
        for (int i = 1; i <= 100; i++)
        {
            squares[i - 1] = i * i;
        }
        return squares;
    }
}

public class SquaresExample
{
    public static void main(String[] args)
    {
        Squares s = new Squares();
        int[] squares = s.calculateSquares();
        for (int i = 0; i < squares.length; i++)
        {
            System.out.println("Square of " + (i + 1) + " is: " + squares[i]);
        }
    }
}
