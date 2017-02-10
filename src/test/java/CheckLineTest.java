import org.junit.Assert;
import org.junit.Test;
import skype.teach.task.lesson3.CheckLine;
import static org.hamcrest.core.Is.is;


/**
 * Created by Александр on 22.01.2017.
 */
public class CheckLineTest {

    @Test
    public void stringInArrayCharTest() {
        CheckLine checkLine = new CheckLine();
        final String string = "abcdr";
        char[] charsArray = checkLine.stringInChar(string);
        char[] result = {'a','b','c','d','r'};
        Assert.assertThat(charsArray,is(result));
    }

    @Test
    public void checkSubstringTest(){
        CheckLine checkLine = new CheckLine();
        String origin = "A drop in the bucket.";
        String sub = "the";
        char[] originArray = checkLine.stringInChar(sub);
        char[] subArray = checkLine.stringInChar(sub);
        boolean result = checkLine.checkSubString(originArray,subArray);
        Assert.assertThat(true,is(result));
    }
}
