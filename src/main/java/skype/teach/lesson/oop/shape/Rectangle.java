package skype.teach.lesson.oop.shape;

/**
 *
 */
public class  Rectangle extends Shape {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double getSquare() {
        return width * length;
    }

}
