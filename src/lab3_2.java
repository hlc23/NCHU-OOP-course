class solution {
    static void sol(int num, char start, char end, char temp) {
        if (num == 1){
            System.out.println("Move disk from "+start+" to "+end);
            return;
        }
        sol(num-1, start, temp, end);
        System.out.println("Move disk from "+start+" to "+end);
        sol(num-1, temp, end, start);
    }

    public static void function(int num) {
        sol(num, 'A', 'C', 'B');
    }
}

// main函式(不要把註解拿掉)

/*
 * 
 * A54321
 * B
 * C
 * 
 */
public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int input_number = sc.nextInt();

        solution.function(input_number);

        sc.close();
    }
}
// */
