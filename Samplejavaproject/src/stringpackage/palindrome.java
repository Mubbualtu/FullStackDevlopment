package stringpackage;

public class palindrome
{
    public static void main(String[] args) {
        String originalString = "racecar";
        boolean isPalindrome = true;
        int start = 0;
        int end = getLength(originalString) - 1;

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

    private static int getLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return length;
    }
}
