import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {
    @Before
    public void start(){
        System.out.println("start");
    }

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
