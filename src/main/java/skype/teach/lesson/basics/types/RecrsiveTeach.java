package skype.teach.lesson.basics.types;

/**
 *
 */
public class RecrsiveTeach {

    public static void main(String[] args) {
int s = sum(4);
        System.out.println(s);
//        f(0);
    }

    public static void f1() {
        System.out.println("f1 Start");
        f2();
        System.out.println("f1 End");
    }

    public static void f2() {
        System.out.println("  f2 Start");
        f3();
        System.out.println("  f2 End");
    }

    public static void f3() {
        System.out.println("    f3 Start");
        System.out.println("    f3 End");
//        new Exception().printStackTrace();
    }

    public static void f(int counter) {
        System.out.println(counter);
        if(counter < 2){
            f(counter+1);
        }
        System.out.println(counter);
    }

    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return sum(n - 1) + n;

//        sum(5) = (1 +2 +3 +4) +5 = sum(4) + 5
//        sum(4) = (1 + 2 +3 ) +4
//        sum(n) = sum(n-1)+ n
//        sum(5) = sum(4)+5 = sum(3) +4 +5 = sum (2) +3 +4 +5 = sum(1) +2 +3 +4+ 5 = 1 + 2 + 3  + 4 + 5
    }
/*
main:
  f(0):
    "0"
    f(1):
      "1"
      f(2):
        "2"
        "2"
      "1"
    "0"
 */

}
