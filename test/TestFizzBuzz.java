/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fizzbuzz.FizzBuzz;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author skiroc
 */
public class TestFizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    
    @Test
    public void hello() {
        System.out.println("Hello World");
    }
    
    @Test
    public void testZero() {
        assertThat(FizzBuzz.toWords(0), is(equalTo("0")));
    }
    
    @Test
    public void testNumberDivisibleByThree() {
        assertThat(FizzBuzz.toWords(3), is(equalTo(FIZZ)));
        assertThat(FizzBuzz.toWords(9), is(equalTo(FIZZ)));
    }
    
    @Test 
    public void testNumberDivisibleByFive() {
        assertThat(FizzBuzz.toWords(5), is(equalTo(BUZZ)));
        assertThat(FizzBuzz.toWords(10), is(equalTo(BUZZ)));
    }
    
    @Test
    public void testNumberDivisibleByThreeAndFive() {
        assertThat(FizzBuzz.toWords(15), is (equalTo(FIZZ_BUZZ)));
        assertThat(FizzBuzz.toWords(30), is (equalTo(FIZZ_BUZZ)));
    }
}
