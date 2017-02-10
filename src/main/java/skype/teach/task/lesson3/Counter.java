package skype.teach.task.lesson3;

/**
 * Created by Александр on 16.01.2017.
 */
public class Counter {

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.add(1,10));
    }

    public long add(long start, long finish) {
        long counter = start;
        long sum = 0;
        while (counter <= finish) {
            if (counter % 2 == 0) {
                sum = sum + counter;
                counter++;
            } else {
                counter++;
            }
        }
        return sum;
    }
}
