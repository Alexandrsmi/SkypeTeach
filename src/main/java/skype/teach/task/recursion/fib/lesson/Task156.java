package skype.teach.task.recursion.fib.lesson;

import java.util.Scanner;

/**
 * http://informatics.mccme.ru/mod/statements/view3.php?id=253&chapterid=156#1
 */
public class Task156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(0,n, sc);
    }

    public static void recursion(int n,int maxN, Scanner sc) {
        if (n != maxN) {
            int b = sc.nextInt();
            recursion(n + 1,maxN, sc);
            System.out.print(b);
            if (n != 0) {
                System.out.print(" ");
            }
        }
    }
}
