package skype.teach.task.recursion.fib.lesson;

import java.util.Scanner;

/**
 * http://informatics.mccme.ru/mod/statements/view3.php?id=20653&chapterid=252#1
 */
public class TaskD {
    private double a;
    private double n;
    private double b;
    private double result;

    public TaskD(double a, double n, double b, double result) {
        this.a = a;
        this.n = n;
        this.b = b;
        this.result = result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double n = sc.nextDouble();
        getValuesPow(a, n, 1,1, 0);
    }

    public static void getValuesPow(double a, double n, double count, double b, double result) {
        if (n >= 0){
            if (n != count) {
                getValuesPow(a * a, n, count +1,b,result);
            } else
                System.out.println(a);
            return;
        }
        if (n <= 0) {
            if (n != count) {
                result = b/a;
                b = result;
                getValuesPow(a, n, count - 1,b,result);
            } else
                System.out.println(result);
            return;
        }
    }
}

