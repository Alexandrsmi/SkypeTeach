package skype.teach.lesson.basics.types;

/**
 *
 */
public class VariableTeach {
    public static void main(String[] args) {
        int x = 10;
        int y;
        y = 20;
        x = y;
        x = x+y;

        x += y;
        x -= y;
        x /= y;
        x *= y;
        x %= y;

        x = x+1;
        x++;
        x--;

        int a = 10;
//        System.out.println(a/3);
//        System.out.println(a%3);

        int b = ++a;
//        a = a+1;
//        int b = a;
//
        System.out.println(b + "  " + a);

    }
}
