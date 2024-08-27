package method_assignments;

class DigitCounter {
    void countAndPrintDigits(int number) {
        if (number == 0) {
            System.out.println("Number of digits: 1");
            return;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}

public class digits {
    public static void main(String[] args) {
        DigitCounter counter = new DigitCounter();
        int number = 123456789;
        counter.countAndPrintDigits(number);
    }
}
