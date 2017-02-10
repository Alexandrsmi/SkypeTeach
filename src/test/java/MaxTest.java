import org.junit.Test;
import skype.teach.task.lesson3.Max;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Александр on 20.01.2017.
 */
public class MaxTest {

    @Test
    public void getMaxTest() {
        Max max = new Max();
        int result = max.max(2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void getMaxThreeValuesTest() {
        Max max = new Max();
        int result = max.max(2, 3, 6);
        assertThat(result, is(6));
    }
}
