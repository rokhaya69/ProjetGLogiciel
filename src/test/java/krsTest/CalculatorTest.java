package krsTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import krs.Calculator;
public class CalculatorTest {

    //create a setup method to init

    Calculator calculator;
    @Before
    public void setup() throws Exception {
        calculator = new Calculator();
    }


    @SuppressWarnings("deprecation")
    @Test
    //@Ignore
    public void testSum() {

        int result = calculator.sum(3, 3);
        org.junit.Assert.assertEquals(6, result);
    }


    @Test
    public void testMinus() {
        org.junit.Assert.assertEquals(0, calculator.minus(2, 2));
    }




    @Test
    public void testMintiplyy() {
        org.junit.Assert.assertEquals(4, calculator.multiply(2, 2));
    }






    @Test
    public void testDivide() {
        org.junit.Assert.assertEquals(2, calculator.divide(6, 3));
    }





    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        calculator.divide(6, 0);
    }






    @Test
    //@Ignore
    public void testMax() {

        int result = calculator.max(200, 3);

        org.junit.Assert.assertEquals(200, result);
    }




    @Test
    //@Ignore
    public void testMin() {
        // Given

        // When
        int result = calculator.min(200, 10);
        // Then

        if(result!=10 )org.junit.Assert.fail();

    }


    @Test
    public void testMinElement() {
        int tab[] = {1,3,4};
        int result;
        try {
            result = calculator.minElement(tab);
            org.junit.Assert.assertEquals(1, result);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }






    @Test
    public void testMaxElement() {

        int tab[] = {1,3,4};

        int result;
        try {
            result = calculator.maxElement(tab);
            org.junit.Assert.assertEquals(4, result);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }




}


