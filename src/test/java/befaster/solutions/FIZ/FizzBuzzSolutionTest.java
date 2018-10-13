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
}
