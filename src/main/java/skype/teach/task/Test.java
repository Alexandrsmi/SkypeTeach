package skype.teach.task;

import skype.teach.task.factorial.FactorialFor;

import java.util.Scanner;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long fac = a;
        long i =1;

        for (; i <= a - 1; i++) {

            fac *= i;
        }
        System.out.println("Factorial " + a + " = " + fac);

        fac = a;
        i = 1;

        while (i <= a - 1) {
            fac *= i;
            i++;
        }
        System.out.println("\n" + "Factorial " + a + " = " + fac);

        fac = a;
        i = 1;

        do {
            fac *= i;
            i++;
        } while (i <= a - 1);

        System.out.println("\n" + "Factorial " + a + " = " + fac);
    }
    }
