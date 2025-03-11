public class HW1 {
    public static void main(String[] args) {
        String l1 = "*   ";
        String l2 = "**  ";
        String l3 = "*** ";
        String l4 = "****";
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Enter the number n: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Invalid input!\r\n");
            }
            if (n == 0) break;

            // how many layer of the triangle
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(l1);
                }
                System.out.println();
                for (int j = 0; j <= i; j++) {
                    System.out.print(l2);
                }
                System.out.println();
                for (int j = 0; j <= i; j++) {
                    System.out.print(l3);
                }
                System.out.println();
                for (int j = 0; j <= i; j++) {
                    System.out.print(l4);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}