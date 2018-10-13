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
    }
}
