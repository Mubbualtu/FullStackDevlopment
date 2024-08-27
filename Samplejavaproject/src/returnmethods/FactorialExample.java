package returnmethods;

class Factorial
{
    long calculateFactorial(int n)
    {
        if (n < 0)
        {
           System.out.println("Number must be non-negative");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
}

public class FactorialExample
{
    public static void main(String[] args)
    {
        Factorial f = new Factorial();
        int number = 5;
        long result = f.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
