package BTVN.Bai1;

import java.util.Scanner;


public class mainBai1 {
    public static void draw(double width, double length, boolean isFilled) {
        if(!isFilled) {
            for (int i = 1; i <= width; i++) {
                for (int j = 1; j <= length; j++) {
                    if (i == 1 || i == width || j == 1 || j == length) {
                        System.out.print("*  ");
                    } else System.out.print("   ");
                }
                System.out.print('\n');
            }
        }
        else{
            for (int i = 1; i <= width; i++) {
                for (int j = 1; j <= length; j++) {
                    System.out.print("*  ");
                }
                System.out.print('\n');
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area: " + circle.getArea());
                    System.out.println("Perimeter: " + circle.getPerimeter());
                    break;
                case 2:
                    System.out.print("Enter the length of the square's side: ");
                    double side = scanner.nextDouble();
                    System.out.print("Is the square filled (true/false): ");
                    boolean filled = scanner.nextBoolean();
                    Square square = new Square("red", filled, side);
                    System.out.println("Area: " + square.getArea());
                    System.out.println("Perimeter: " + square.getPerimeter());
                    draw(side, side, filled);
                    break;
                case 3:
                    System.out.print("Enter the length of the rectangle's width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter the length of the rectangle's length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Is the square filled (true/false): ");
                    boolean filled2 = scanner.nextBoolean();
                    Rectangle rectangle = new Rectangle(width, length);
                    System.out.println("Area: " + rectangle.getArea());
                    System.out.println("Perimeter: " + rectangle.getPerimeter());
                    draw(width, length, filled2);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter again!");
            }
        }
    }
}
