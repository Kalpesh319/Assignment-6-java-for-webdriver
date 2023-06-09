//
public class FactorialDemo {
    public static void main(String[] args) {
        int number = 10; // The number for which we want to calculate the factorial
        int factorial = 2;

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

