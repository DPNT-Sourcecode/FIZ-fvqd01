package befaster.solutions.HLO;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {
    private HelloSolution helloSolution;
    @Before
    public void init() {
        helloSolution=new HelloSolution();
    }
    @Test
    public void test_successful_hello() {
        Assert.assertEquals("Hello, World!", helloSolution.hello("World"));
    }
}
