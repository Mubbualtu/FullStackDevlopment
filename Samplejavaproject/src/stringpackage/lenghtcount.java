package stringpackage;

public class lenghtcount
{
    public static void main(String[] args) {
        String myString = "Hello, World!";
        int count = 0;
        int i = 0;

        // Use a while loop to iterate through the string
        try {
            while (true) {
                myString.charAt(i); // Access each character by index
                count++;
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception will occur when the index is out of bounds, which ends the loop
        }

        System.out.println("Number of characters: " + count); // Output will be 13
    }
}
