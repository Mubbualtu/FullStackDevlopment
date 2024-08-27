package method_assignments;

class DigitSumCalculator
{
    void sumOfDigits(int number)
    {
        int sum = 0;
        int temp = number;
        if (number < 0)
        {
            number = -number;
        }
        while (number > 0)
        {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of the digits in " + temp + " is: " + sum);
    }
}

public class SumOfDigits {
    public static void main(String[] args) {
        DigitSumCalculator calculator = new DigitSumCalculator();
        int number = 123456;
        calculator.sumOfDigits(number);
    }
}
