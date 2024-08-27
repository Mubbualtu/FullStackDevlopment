package method_assignments;

class ArrayCubeCalculator {
    void displayCubes(int[] array) {
        System.out.println("Cube of each element in the array:");
        for (int i = 0; i < array.length; i++) {
            int cube = array[i] * array[i] * array[i];
            System.out.println("Cube of " + array[i] + " is: " + cube);
        }
    }
}

public class DisplayCubes {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ArrayCubeCalculator calculator = new ArrayCubeCalculator();
        calculator.displayCubes(array);
    }
}
