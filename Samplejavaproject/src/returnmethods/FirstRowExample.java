package returnmethods;

class FirstRow
{
    char[] getFirstRow(char[][] array)
    {
        return array[0];
    }
}

public class FirstRowExample
{
    public static void main(String[] args)
    {
        char[][] array = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'}
        };
        FirstRow fr = new FirstRow();
        char[] firstRow = fr.getFirstRow(array);
        for (int i = 0; i < firstRow.length; i++)
        {
            System.out.print(firstRow[i] + " ");
        }
    }
}
