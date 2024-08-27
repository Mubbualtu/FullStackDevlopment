package returnmethods;

class DiagonalElements
{
    short[] getPrimaryDiagonal(short[][] matrix)
    {
        int n = matrix.length;
        short[] primaryDiagonal = new short[n];
        for (int i = 0; i < n; i++)
        {
            primaryDiagonal[i] = matrix[i][i];
        }
        return primaryDiagonal;
    }
}

public class Diagonal
{
    public static void main(String[] args)
    {
        short[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 21}
        };

        DiagonalElements de = new DiagonalElements();
        short[] primaryDiagonal = de.getPrimaryDiagonal(matrix);
        System.out.println("Primary Diagonal:");
        for (int i = 0; i < primaryDiagonal.length; i++)
        {
            System.out.print(primaryDiagonal[i] + " ");
        }
        System.out.println();
    }
}
