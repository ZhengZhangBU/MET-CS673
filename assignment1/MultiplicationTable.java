package assigment1;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(12);
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++) {
                int result = i * j;
                System.out.print(i + " * " + j + " = " + result + "\t");
            }
            System.out.println();
        }
    }
}
