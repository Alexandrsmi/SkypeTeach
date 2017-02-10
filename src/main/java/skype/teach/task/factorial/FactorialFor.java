package skype.teach.task.factorial;

/**
 *
 */
public class FactorialFor extends Factorial {
    private long value;
    private long a;

    public FactorialFor(long a) {

        this.a = a;
    }

    public long getFactorial() {
        value = a;
        for (long i = 1; i <= a - 1; i++) {
            value *= i;

        }
        return value;
    }
}
