package assigment1;

public class LeapYear {
    public static void main(String[] args) {
        boolean bool = isLeapYear(2022);
        System.out.println("2022: " + bool);

        boolean bool1 = isLeapYear(2020);
        System.out.println("2020: " + bool1);
    }

    public static boolean isLeapYear(int year) {
        return isDivisible(year, 400) || isDivisible(year, 4) && !isDivisible(year, 100);
    }

    public static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}
