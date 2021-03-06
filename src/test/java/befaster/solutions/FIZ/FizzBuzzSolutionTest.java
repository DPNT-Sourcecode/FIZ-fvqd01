package befaster.solutions.FIZ;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzzSolution;

    @Before
    public void init() {
        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    public void return_number_when_not_divided() {
        Assert.assertEquals("1", fizzBuzzSolution.fizzBuzz(1));
        Assert.assertEquals("2", fizzBuzzSolution.fizzBuzz(2));
    }

    @Test
    public void return_fizz_when_divided_3() {
        Assert.assertEquals("fizz", fizzBuzzSolution.fizzBuzz(6));
        Assert.assertEquals("fizz", fizzBuzzSolution.fizzBuzz(9));
    }

    @Test
    public void return_buzz_when_divided_5() {
        Assert.assertEquals("buzz", fizzBuzzSolution.fizzBuzz(10));
        Assert.assertEquals("buzz", fizzBuzzSolution.fizzBuzz(20));
    }

    @Test
    public void return_fizzbuzz_when_divided_3_5() {
        Assert.assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(120));
        Assert.assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(60));
    }

    @Test
    public void return_fizz_when_contains_3() {
        Assert.assertEquals("fizz", fizzBuzzSolution.fizzBuzz(13));
        Assert.assertEquals("fizz", fizzBuzzSolution.fizzBuzz(73));
    }

    @Test
    public void return_fizz_when_contains_5() {
        Assert.assertEquals("buzz", fizzBuzzSolution.fizzBuzz(52));
        Assert.assertEquals("buzz", fizzBuzzSolution.fizzBuzz(572));
    }

    @Test
    public void return_fizz_buzz_when_contains_5_contains_3() {
        Assert.assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(352));
        Assert.assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(3572));
    }

    @Test
    public void return_fizz_buzz_when_divide_3_contains_5() {
        Assert.assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(252));
        Assert.assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(4572));
    }

    @Test
    public void return_fizz_buzz_when_divide_5_contains_3() {
        Assert.assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(230));
        Assert.assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(4370));
    }

    @Test
    public void return_fizz_deluxe_when_contains_3_dividedby_3() {
        Assert.assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(306));
    }

    @Test
    public void return_buzz_deluxe_when_contains_5_dividedby_5() {
        Assert.assertEquals("buzz deluxe", fizzBuzzSolution.fizzBuzz(500));
    }

    @Test
    public void return_fizz_buzz_deluxe_when_contains_3_5_dividedby_3_5() {
        Assert.assertEquals("fizz buzz deluxe", fizzBuzzSolution.fizzBuzz(30));
    }

    @Test
    public void return_fakedeluxe_when_deluxe_and_odd() {
        Assert.assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(321));
        Assert.assertEquals("buzz fake deluxe", fizzBuzzSolution.fizzBuzz(5555));
        Assert.assertEquals("fizz buzz fake deluxe", fizzBuzzSolution.fizzBuzz(135));
    }
}
