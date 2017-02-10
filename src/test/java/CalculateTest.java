import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import skype.teach.task.calculator.oop.Calculate;

/**
 * Created by Александр on 14.01.2017.
 */
public class CalculateTest {
    @Test
    public void getSumTest() {
        Calculate calculate = new Calculate();
        calculate.getSum(3, 4);
        assertThat(calculate.getResult(),is (7.0));
    }
    @Test
    public void getSubTest() {
        Calculate calculate = new Calculate();
        calculate.getSub(3, 4);
        assertThat(calculate.getResult(),is (-1.0));
    }
    @Test
    public void getDivTest() {
        Calculate calculate = new Calculate();
        calculate.getDiv(8, 4);
        assertThat(calculate.getResult(),is (2.0));
    }
    @Test
    public void getMulTest() {
        Calculate calculate = new Calculate();
        calculate.getMul(3, 4);
        assertThat(calculate.getResult(),is (12.0));
    }
}
