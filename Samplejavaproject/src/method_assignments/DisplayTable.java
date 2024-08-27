package method_assignments;

class MultiplicationTable {
    void displayTable(int number) {
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class DisplayTable {
    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        int number = 7;
        table.displayTable(number);
    }
}
