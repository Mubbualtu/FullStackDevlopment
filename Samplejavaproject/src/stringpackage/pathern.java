
/*p
p r
p r o
p r o g
p r o g r
p r o g r a
p r o g r a m
 wrp to design above pathern without using string method*/

package stringpackage;

public class pathern
{
    public static void main(String[] args) {
        char[] word = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        int length = word.length;


        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word[j] + " ");
            }
            System.out.println();
        }
    }
}