package returnmethods;

class MultiplicationTableGenerator
{
    int[] generateTable(int number)
    {
        int[] table = new int[10];
        for (int i = 0; i < 10; i++)
        {
            table[i] = number * (i + 1);
        }
        return table;
    }
}

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        MultiplicationTableGenerator mtg = new MultiplicationTableGenerator();

        int number = 12;
        int[] table = mtg.generateTable(number);
        for (int i = 0; i < table.length; i++)
        {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
