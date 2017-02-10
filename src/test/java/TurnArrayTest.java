import org.junit.Assert;
import org.junit.Test;
import skype.teach.task.lesson3.TurnArray;

/**
 * Created by Александр on 22.01.2017.
 */
public class TurnArrayTest {
    @Test
    public void getTurnArray() {
        TurnArray turnArray = new TurnArray();
        int[][] array = {{1, 2}, {3, 4}};
        int[][] arrayResult = {{3, 1}, {4, 2}};
        int[][] arrayTest = turnArray.getTurnArray(array);
        Assert.assertArrayEquals(arrayTest, arrayResult);
    }
}
