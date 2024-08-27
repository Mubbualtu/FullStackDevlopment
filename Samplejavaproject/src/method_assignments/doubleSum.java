package method_assignments;

class ArraySum {
    void sumOfSecondRow(double[][] matrix) {
        if (matrix.length < 2) {
            System.out.println("The matrix does not have a second row.");
            return;
        }

        double sum = 0;
        for (int j = 0; j < matrix[1].length; j++) {
            sum += matrix[1][j];
        }

        System.out.println("Sum of the elements in the second row: " + sum);
    }
}

public class doubleSum {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.1, 2.2, 3.3},
                {4.4, 5.5, 6.6},
                {7.7, 8.8, 9.9}
        };

        ArraySum arraySum = new ArraySum();
        arraySum.sumOfSecondRow(matrix);
    }
}
