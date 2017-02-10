import org.junit.Assert;
import org.junit.Test;
import skype.teach.task.lesson3.Paint;

/**
 * Created by Александр on 17.01.2017.
 */
public class PaintTest {
    @Test
    public void getPiramidTest(){
        Paint paint = new Paint();
        paint.getPiramid(2);
    }
}
