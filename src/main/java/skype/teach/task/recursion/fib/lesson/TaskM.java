package skype.teach.task.recursion.fib.lesson;

import java.util.Scanner;

/**
 *
 */
public class TaskM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        recursion(sc.nextInt(), 2);
    }
    public static void recursion(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        } else {
            recursion(n, ++k);
        }
    }


}
