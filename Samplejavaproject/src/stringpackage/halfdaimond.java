/*p
p r
p r o
p r o g
p r o g r
p r o g r a
p r o g r a m
p r o g r a
p r o g r
p r o g
p r o
p r
p
 wrp to design above pathern without using string method*/


package stringpackage;

public class halfdaimond
{
    public static void main(String[] args) {
        char[] word = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        int length = word.length;

        // Top half of the pattern
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word[j] + " ");
            }
            System.out.println(); // Move to the next line
        }

        // Bottom half of the pattern
        for (int i = length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word[j] + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
