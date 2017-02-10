package skype.teach.lesson.oop;

/**
 *
 */
public class ExtendTeach {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a = b;
        a = new B ();
        b = (B)a;
        System.out.println(a instanceof B);
    }
}
class A {

}
class B extends A{

}
