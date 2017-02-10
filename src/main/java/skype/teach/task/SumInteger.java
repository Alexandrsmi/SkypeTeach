package skype.teach.task;

import java.util.Scanner;
import java.math.BigInteger;

/**
 * 1 0 -1 -2 -3 -4 -5 = 1-(1+2+3+4+5)
 * http://informatics.mccme.ru/mod/statements/view3.php?id=1120&chapterid=1466#1
 */
public class SumInteger {
    public static void main(String[] args) {
        sum();
        sumLong();
    }

    public static BigInteger enterValue() {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        BigInteger i = new BigInteger(number);
        return i;
    }

    public static void sum() {
        BigInteger sum;
        BigInteger bN = enterValue();
        if (bN.compareTo(BigInteger.ZERO) < 0) {
            BigInteger positiveN = bN.abs();
            sum = sum(positiveN);
            sum = BigInteger.ONE.subtract(sum);
        } else {
            sum = sum(bN);
        }

        System.out.println(sum);
    }

    public static BigInteger sum(BigInteger bN) {
        BigInteger bN1 = bN.add(BigInteger.ONE);
        BigInteger bM = bN.multiply(bN1);
        BigInteger sum = bM.divide(new BigInteger("2"));
        return sum;
    }

    public static long enterValueLong() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }

    public static void sumLong() {
        long sum;
        long n = enterValueLong();
        if (n < 0){
            n = ~n + 1;
            if ((n % 2) == 0) {
                sum = (n / 2) * (1 + n);
            } else {
                sum = ((1 + n) / 2) * (n);
            }
            sum = 1- sum;
        } else
            if ((n % 2) == 0) {
                sum = (n / 2) * (1 + n);
            } else {
                sum = ((1 + n) / 2) * (n);
            }
        System.out.println(sum);
    }
}