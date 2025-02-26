class solution {
    public static String pig_latin(String first, String last) {
        String p_first =  first.substring(1, 2).toUpperCase() + first.substring(2) + first.charAt(0) + "ay";
        String p_last = last.substring(1, 2).toUpperCase() + last.substring(2) + last.charAt(0) + "ay";
        return p_first + " " + p_last;
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String first_name = sc.next();
        String last_name = sc.next();
        System.out.println(solution.pig_latin(first_name, last_name));

        sc.close();
    }
}
