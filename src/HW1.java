public class HW1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Enter the number n: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Invalid input!\r\n");
            }
            if (n == 0)
                break;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int k = 1; k <= i; k++) {
                        for (int l = 1; l <= j; l++) {
                            System.out.print("*");
                        }
                        for (int l = 1; l <= n-j; l++) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }

        }
        sc.close();
    }
}