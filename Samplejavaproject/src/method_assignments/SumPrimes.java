package method_assignments;

class PrimeSumCalculator

{
    void sumPrimesInRange(int start, int end)
    {
        int sum = 0;

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++)
        {
            boolean isPrime = true;

            if (num <= 1)
            {
                continue;
            }

            for (int i = 2; i < num; i++)
            {
                if (num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                System.out.println(num);
                sum += num;
            }
        }

        System.out.println("Sum of prime numbers between " + start + " and " + end + ": " + sum);
    }
}

public class SumPrimes
{
    public static void main(String[] args)
    {
        PrimeSumCalculator calculator = new PrimeSumCalculator();
        int start = 1;
        int end = 100;
        calculator.sumPrimesInRange(start, end);
    }
}
