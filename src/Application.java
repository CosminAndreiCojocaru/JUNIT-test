



import org.junit.Test;

import java.util.Scanner;

class Application {

    @Test(expected = ArithmeticException.class)
    public static void main(String args[]) {
        new Application().execute();
    }

    public double perimeter(int constant, double pi, double radius) {
        return (constant * pi * radius);
    }

    public double perimeter(double base, double height, double hypotenuse) {
        return (base + height + hypotenuse);
    }

    public double perimeter(int constant1, double length) {
        return (constant1 * length);
    }

    public double perimeterRLengthWidth(int constant2, double length1, double width) {
        return (constant2 * (length1 + width));
    }

    private void execute() {
        final double pi = Math.PI;
        final int constant = 4;
        double length;

        final int constant1 = 2;
        double radius;

        final int constant2 = 2;
        double length1;
        double width;

        double height;
        double hypotenuse;
        double base;

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce The Radius");
        radius = s.nextDouble();
        System.out.println("Introduce The Square Length");
        length = s.nextInt();
        System.out.println("Introduce The Rectangle Length");
        length1 = s.nextInt();
        System.out.println("Introduce The Rectangle width");
        width = s.nextInt();
        System.out.println("Introduce The Triangle Base");
        base = s.nextInt();
        System.out.println("Introduce The Triangle height");
        height = s.nextInt();
        System.out.println("Introduce The Triangle hypotrnuse");
        hypotenuse = s.nextInt();

        System.out.println("Perimeter = " + perimeter(constant1, pi, radius));
        System.out.println("Perimeter = " + perimeter(constant, length));
        System.out.println("Perimeter = " + perimeterRLengthWidth(constant2, length1, width));
        System.out.println("Perimeter = " + perimeter(base, height, hypotenuse));

    }
}
