import org.junit.*;
import skype.teach.task.lesson3.Turn;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Александр on 17.01.2017.
 */
public class TurnTest {
    @Test
    public void getBackArrayTest() {
        Turn turn = new Turn();
        int[] mass = {3, 2, 1};
        int[] array = {1, 2, 3};
        int[] result = turn.getBackArray(array);
        assertThat(mass, is(result));
    }


}
