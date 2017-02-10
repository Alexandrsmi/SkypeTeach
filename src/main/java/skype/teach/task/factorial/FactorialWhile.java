package skype.teach.task.factorial;

/**
 *
 */

public class FactorialWhile extends Factorial {
    private long value;
    private long a;
    private long i = 1;

    public FactorialWhile(long a) {

        this.a = a;
    }

    public long getFactorial() {
        value = a;
        while (i <= a - 1) {
            value *= i;
            i++;
        }
        return value;
    }
}


