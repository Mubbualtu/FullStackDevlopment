package stringpackage;

public class deleteDay
{
    public static void main(String[] args) {
        String originalString = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String resultString = "";
        int length = originalString.length();

        for (int i = 0; i < length; i++) {
            if (i + 2 < length && originalString.charAt(i) == 'D' && originalString.charAt(i + 1) == 'A' && originalString.charAt(i + 2) == 'Y') {
                i += 2;
            } else {
                resultString += originalString.charAt(i);
            }
        }
        System.out.println(resultString);
    }
}
