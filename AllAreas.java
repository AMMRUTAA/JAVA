import java.util.Scanner;

abstract class Shape {
    abstract void area(Scanner scanner);
}

class Triangle extends Shape {
    public void area(Scanner scanner) {
        double base, height, area;
        System.out.println("Calculating area of Triangle");
        System.out.print("Enter Base: ");
        base = scanner.nextDouble();
        System.out.print("Enter Vertical Height: ");
        height = scanner.nextDouble();
        area = 0.5 * base * height;
        System.out.println("Area of Triangle is: " + area);
    }
}

class Rectangle extends Shape {
    public void area(Scanner scanner) {
        double width, height, area;
        System.out.println("Calculating area of Rectangle");
        System.out.print("Enter Width: ");
        width = scanner.nextDouble();
        System.out.print("Enter Height: ");
        height = scanner.nextDouble();
        area = width * height;
        System.out.println("Area of Rectangle is: " + area);
    }
}

class Circle extends Shape {
    public void area(Scanner scanner) {
        double radius, area;
        System.out.println("Calculating area of Circle");
        System.out.print("Enter Radius: ");
        radius = scanner.nextDouble();
        area = 3.14 * radius * radius;
        System.out.println("Area of Circle is: " + area);
    }
}

public class AllAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape t1 = new Triangle();
        Shape r1 = new Rectangle();
        Shape c1 = new Circle();

        t1.area(scanner);
        System.out.println();
        r1.area(scanner);
        System.out.println();
        c1.area(scanner);

        scanner.close(); // Close the scanner once after all operations
    }
}
