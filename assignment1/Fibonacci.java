package assigment1;

public class Fibonacci {
    public static void main(String[] args) {
        printFib();
    }

    public static void printFib() {
        for (int i = 0; i < 100; i++) {
            System.out.print(calculateFib(i) + " ");
        }
    }

    public static int calculateFib(int number) {
        if (number == 0 || number == 1)
            return 1;
        else
            return calculateFib(number - 2) + calculateFib(number - 1);
    }
}
