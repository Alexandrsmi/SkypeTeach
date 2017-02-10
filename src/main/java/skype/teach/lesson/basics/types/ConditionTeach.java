package skype.teach.lesson.basics.types;

/**
 *
 */
public class ConditionTeach {
    public static void main(String[] args) {
        int x = 10;
        boolean b = x == 10;
        if (x == 10) {
            System.out.println("Yes");
        } else if (x == 20) {
            System.out.println("UntNo");
        } else {
            System.out.println("No");
        }
        int y = 20;
        b = x == 10 && y == 20;
        b = x == 10 || y == 20;
        b = !(x == 10 || y == 20);
        b = !(x == 10) && !(y == 20);
        b = x != 10 && y != 20;
        b = x == 10 || y == 20 && y > x;

//        A = condition = true ? B : C;
        int a =   x > 10
                ? x
                : y > 20
                ? y
                : 100;
    }
}
