package skype.teach.task.recursion.fib.lesson;

import java.util.Scanner;

/**
 *
 */
public class task199 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        recursion(sc.nextInt(), sc.nextInt());
    }

    public static void recursion(int a, int b) {
        int f = a%b;
        if (f == 0) {
            System.out.println(b);
        }else if (f > 0){
            a = b;
            b = f;
            recursion(a,b);
        }
    }
}
