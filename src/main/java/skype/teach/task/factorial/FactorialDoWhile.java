package skype.teach.task.factorial;

/**
 *
 */

public class FactorialDoWhile extends Factorial {
    private long a;

    public FactorialDoWhile(long a) {

        this.a = a;
    }

    public long getFactorial() {
        long value = a;
        long i = 1;
        do {
            value *= i;
            i++;
        } while (i <= a - 1);
        return value;
    }
}


