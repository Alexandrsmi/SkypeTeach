package skype.teach.task.lesson3;

/**
 * Created by Александр on 16.01.2017.
 */
public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int sum = factorial.getFactorial(4);
        System.out.println(sum);
    }

    public int getFactorial(int fact) {
        int counter = 1;
        int sum = 1;
        if (fact == 1) {
            return 1;
        }
        while (counter <= fact) {
            sum = sum * counter;
            counter++;
        }
        return sum;
    }
}
