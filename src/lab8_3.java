import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        IntCalculator calculator = new IntCalculator();

        try {
        	int sum = calculator.add(a, b);
        	System.out.printf("%d + %d = %d\n", a, b, sum);
        }
        catch(OverflowException e){
        	System.out.println(e.getMessage());
        }
        try {
        	int quotient = calculator.divide(a, b);
        	System.out.printf("%d / %d = %d\n", a, b, quotient);
        }
        catch (DivideByZeroException e) {
        	System.out.println(e.getMessage());
        };
    }
}

// ----- You don't need to modify the code below this line. -----

class IntCalculator {
    /**
     * Calculate the sum of two integers.
     *
     * @param a first integer
     * @param b second integer
     * @return the sum of two integers
     * @throws OverflowException if the sum is out of Integer range
     */
    public int add(int a, int b) throws OverflowException {
        long result = (long) a + (long) b;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            String errorMesseng = String.format("The sum of %d and %d is out of Integer range.", a, b);
            throw new OverflowException(errorMesseng);
        }
        return a + b;
    }

    /**
     * Calculate the quotient of two integers.
     *
     * @param a dividend
     * @param b divisor
     * @return the quotient of two integers
     * @throws DivideByZeroException if the divisor is zero
     */
    public int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            String errorMesseng = String.format("%d cannot be divided by %d.", a, b);
            throw new DivideByZeroException(errorMesseng);
        }
        return a / b;
    }
}

/**
 * This exception is thrown when a division by zero is attempted.
 */
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

/**
 * This exception is thrown when the result of an operation is out of Integer
 * range.
 */
class OverflowException extends Exception {
    public OverflowException(String message) {
        super(message);
    }
}
