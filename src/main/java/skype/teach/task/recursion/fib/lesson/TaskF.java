package skype.teach.task.recursion.fib.lesson;


import java.util.*;

/**
 * http://informatics.mccme.ru/mod/statements/view3.php?id=20653&chapterid=112182#1
 */
public class TaskF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List e = getBinaryCode(n);
        print(e, n);
    }

    public static List getBinaryCode(int n) {
        if (n == 0) {
            List e = null;
            return e;
        }
        int c;
        List<Integer> x = new ArrayList();
        if (n < 0) {
            n = n * (-1);
        }
        while (n != 0) {
            c = n % 2;
            x.add(0, c);
            n = n / 2;
        }
        return x;
    }

    public static void print(List<E> e, int n) {
        if (n == 0){
            System.out.println(0);
        }
        else if (n > 0) {
            Integer[] array;
            array = e.toArray(new Integer[e.size()]);
            for (int i = 0; i <= array.length - 1; i++) {
                System.out.print(array[i]);
            }
        } else if (n < 0) {
            Integer[] array;
            array = e.toArray(new Integer[e.size()]);
            System.out.print("-");
            for (int i = 0; i <= array.length - 1; i++) {
                System.out.print(array[i]);
            }
        }
    }
}

class E {
}