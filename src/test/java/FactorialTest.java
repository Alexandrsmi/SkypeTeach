import org.junit.Test;
import skype.teach.task.lesson3.Factorial;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Created by Александр on 16.01.2017.
 */
public class FactorialTest {

    @Test
    public void factorialTest(){
        Factorial factorial = new Factorial();
        int result = factorial.getFactorial(4);
        assertThat(result,is(24));
    }
}
