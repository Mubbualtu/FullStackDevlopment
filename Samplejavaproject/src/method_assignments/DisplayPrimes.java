package method_assignments;

class PrimeNumberFinder
{
    void displayPrimesInRange(int start, int end)
    {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++)
        {
            if (num <= 1)
            {
                continue;
            }
            boolean isPrime = true;
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
            }
        }
    }
}

public class DisplayPrimes {
    public static void main(String[] args)
    {
        PrimeNumberFinder finder = new PrimeNumberFinder();
        int start = 1;
        int end = 50;
        finder.displayPrimesInRange(start, end);
    }
}
