import skype.teach.task.lesson3.Counter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Александр on 16.01.2017.
 */
public class CounterTest {
    @Test
    public void countTest() {
        Counter counter = new Counter();
        int result = (int) counter.add(1, 3);
        assertThat(result, is(2));
    }
}
