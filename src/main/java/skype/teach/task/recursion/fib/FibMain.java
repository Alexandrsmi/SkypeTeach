package skype.teach.task.recursion.fib;

import java.util.Scanner;

/**
 *
 */
public class FibMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = f(sc.nextInt());
        System.out.println(n);
    }
    public static int f (int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
      else  return f(n-1)+f(n-2);
    }
}
