package returnmethods;

class Concatenation
{
    String concatenate(String[] array)
    {
        String sum = "";
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        return sum;
    }
}

public class Stringconcatenate
{
    public static void main(String[] args)
    {
        String[] s = {"mubina", "balikai", "ammi", "abba"};
        Concatenation c = new Concatenation();
        String finalString = c.concatenate(s);
        System.out.println(finalString);
    }
}
