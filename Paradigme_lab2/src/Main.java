//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangle tri = new Triangle(1.1f, "mov");
        Circle c = new Circle(1.5f,"roz");
        Square sq = new Square(1.2f,"verde");
        System.out.println("Triangle area = " + tri.getArea()+" details: " + tri);
        System.out.println("Circle area = " + c.getArea() + " details: " + c);
        System.out.println("Square area = " + sq.getArea() + " details: " + sq);
        Triangle tri2 = new Triangle(1.1f, "mov");
        System.out.println("Triangle2 equals to Triangle1: " + tri.equals(tri2));
        }
    }
