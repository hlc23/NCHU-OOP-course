// Create a class call ShapeCalculator.
// Write the Method call area in it.(3 case)
class ShapeCalculator {
    public static double area(double r){
        return r*r*Math.PI;
    }

    public static double area(double l, double w){
        return l*w;
    }

    public static double area(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

/* Main program code provided for reference. Please do not remove the comments.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(ShapeCalculator.area(r));
        System.out.println(ShapeCalculator.area(l, w));
        System.out.println(ShapeCalculator.area(a, b, c));
    }
}
*/

