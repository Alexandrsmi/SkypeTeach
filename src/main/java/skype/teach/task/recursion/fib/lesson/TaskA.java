package skype.teach.task.recursion.fib.lesson;

import java.util.Scanner;

/**
 * http://informatics.mccme.ru/mod/statements/view3.php?id=20653&chapterid=112213#1
 */
public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sumValues(sc.nextInt());
        System.out.println(sum);
    }

    public static int sumValues(int i) {
        int a = i;
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
