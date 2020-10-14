package ch.juventus.javadoc;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;




public class MathUtilsTest {

    private final MathUtils mathUtils = new MathUtils();

    @Test
    public void testAddition() {
        // given
        List<Double> numbers = new ArrayList<>();
        numbers.add(4.5);
        numbers.add(4.5);

        // when
        double result = mathUtils.addition(numbers);
        // then
        assertEquals(9, result);
    }
/*
    @Test
    public void testMultiplication() {
        // given
        List<Double> numbers = new ArrayList<>();
        numbers.add(3.0);
        numbers.add(3.0);

        // when
        double result = mathUtils.multiplication(numbers);
        // then
        assertEquals(9, result);
    }

*/

}
