package stringpackage;

public class insertDAY
{
    public static void main(String[] args) {
        String originalString = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String modifiedString = "";
        int length = originalString.length();

        for (int i = 0; i < length; i++) {
            if (i + 2 < length && originalString.charAt(i) == 'D' && originalString.charAt(i + 1) == 'A' && originalString.charAt(i + 2) == 'Y') {
                modifiedString += "DAY,";
                i += 2;
            } else {
                modifiedString += originalString.charAt(i);
            }
        }
        System.out.println(modifiedString);
    }
}
