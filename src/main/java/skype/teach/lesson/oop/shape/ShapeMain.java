package skype.teach.lesson.oop.shape;

/**
 *
 */
public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(1);

        Shape shape = circle;
        printSquareSqrt(shape);
        shape = rectangle;
        printSquareSqrt(shape);

    }

    public static void printSquareSqrt(Shape shape) {
        double square = shape.getSquare();
        double squareSqrt = Math.sqrt(square);
        System.out.println(squareSqrt);
    }
}
