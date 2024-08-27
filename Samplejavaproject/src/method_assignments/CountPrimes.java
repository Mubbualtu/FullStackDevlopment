package method_assignments;

class PrimeNumberCounter
{
    void countPrimesInRange(int start, int end)
    {
        int count = 0;
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
                count++;
            }
        }
        System.out.println("Count of prime numbers between " + start + " and " + end + ": " + count);
    }
}
public class CountPrimes
{
    public static void main(String[] args)
    {
        PrimeNumberCounter counter = new PrimeNumberCounter();
        int start = 50;
        int end = 150;
        counter.countPrimesInRange(start, end);
    }
}
