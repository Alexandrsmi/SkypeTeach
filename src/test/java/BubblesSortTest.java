
import skype.teach.task.lesson3.BubblesSort;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Александр on 17.01.2017.
 */
public class BubblesSortTest {
    @Test

    public void getBubblesSortTest() {
        final int one = 1;
        final int three = 3;
        final int five = 5;
        final int seven = 7;
        BubblesSort bubblesSort = new BubblesSort();
        int[] testArray = {one, three, five, seven, seven};
        int[] test = {one, five, seven, seven, three};
        int[] resultArray = bubblesSort.getBubbleSortArray(test);
        assertThat(testArray, is(resultArray));
    }
}