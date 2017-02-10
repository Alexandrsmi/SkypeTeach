package skype.teach.task.recursion.fib.lesson;
import java.util.Scanner;

/**
 *http://informatics.mccme.ru/mod/statements/view3.php?id=20653&chapterid=313#1
 */
public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        long result = 0;
            result = (fact(n)) / (fact(x)*(fact(n-x)));

        System.out.println(result);

    }

    public static long fact(int a) {
        long fact = 1;
        for (long i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
