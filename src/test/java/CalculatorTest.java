import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

        Calculator calculator;

        @Before
        public void setUp(){
            calculator = new Calculator(12, 8, 13.0, 9.0);
        }
        @Test
        public void canAddNumbers(){
                assertEquals(20, calculator.addNumbers());
        }
        @Test
        public void canSubtractNumbers(){
                assertEquals(4, calculator.subtractNumbers());
        }
        @Test
        public void canMultiplyNumbers(){
                assertEquals(96, calculator.multiplyNumbers());
        }
        @Test
        public void canDivideNumbers(){
                assertEquals(1.44, calculator.divideNumbers(), 0.01);
        }

    /*
     Create a Calculator class. This should have functions for Add, Subtract, Multiply and Divide.
     Your methods should take in two ints to perform the calculations on (except the Divide method.
     This should take two doubles as arguments)
    */

}
