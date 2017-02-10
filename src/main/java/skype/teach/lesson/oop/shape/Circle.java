package skype.teach.lesson.oop.shape;

/**
 *
 */
public class Circle extends Shape {

    private int radius;

    public Circle (int radius){

        this.radius = radius;
    }
    public double getSquare (){
        return Math.PI * Math.pow(radius,2);
    }

}
