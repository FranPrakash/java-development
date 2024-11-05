package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test // positive numbers
   public void dividingTwoNumbers() {
//arrange
SimpleCalculator mySimpleCalculator = new SimpleCalculator();

//act
double result = mySimpleCalculator.dividingTwoNumbers(4,2);

//Assert
assertEquals(2, result);

    }

    @Test // test negative number and positive number
    public void negative_Numbers_and_positive_Numbers(){

        SimpleCalculator mySimpleCalculator = new SimpleCalculator();
        double result = mySimpleCalculator.dividingTwoNumbers(4, -2);
        assertEquals(-2, result);
    }

    @Test //division by 0
    public void number_divided_by_Zero(){
        SimpleCalculator mySimpleCalculator = new SimpleCalculator();
        double result = mySimpleCalculator.dividingTwoNumbers(4, 0);
        assertEquals(Double.POSITIVE_INFINITY,result);
    }



}