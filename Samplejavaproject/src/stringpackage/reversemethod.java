package stringpackage;

public class reversemethod
{
    public static void main(String[] args) {
        String originalString = "madam";
        boolean isPalindrome = true;
        int start = 0;
        int end = originalString.length() - 1;

        while (start < end) {
            if (originalString.charAt(start) != originalString.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }
    }
}
