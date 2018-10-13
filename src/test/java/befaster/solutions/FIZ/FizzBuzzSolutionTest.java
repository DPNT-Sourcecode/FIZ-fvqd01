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
        Assert.assertEquals("fizz", fizzBuzzSolution.fizzBuzz(3));
        Assert.assertEquals("fizz", fizzBuzzSolution.fizzBuzz(9));
    }

    @Test
    public void return_buzz_when_divided_5() {
        Assert.assertEquals("buzz", fizzBuzzSolution.fizzBuzz(5));
        Assert.assertEquals("buzz", fizzBuzzSolution.fizzBuzz(25));
    }

    @Test
    public void return_buzz_when_divided_3_5() {
        Assert.assertEquals("fizz buzz", fizzBuzzSolution.fizzBuzz(15));
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
    public void return_deluxe_when_greaterthan10_and_identical() {
        Assert.assertEquals("deluxe", fizzBuzzSolution.fizzBuzz(11));
        Assert.assertEquals("fizz deluxe", fizzBuzzSolution.fizzBuzz(111));
        Assert.assertEquals("buzz deluxe", fizzBuzzSolution.fizzBuzz(5555));
        Assert.assertEquals("fizz buzz deluxe", fizzBuzzSolution.fizzBuzz(555));
    }

    @Test
    public void return_fakedeluxe_when_greaterthan10_and_identical_odd() {
        Assert.assertEquals("fake deluxe", fizzBuzzSolution.fizzBuzz(11));
        Assert.assertEquals("fizz fake deluxe", fizzBuzzSolution.fizzBuzz(111));
        Assert.assertEquals("buzz fake deluxe", fizzBuzzSolution.fizzBuzz(5555));
        Assert.assertEquals("fizz buzz fake deluxe", fizzBuzzSolution.fizzBuzz(555));
    }
}
