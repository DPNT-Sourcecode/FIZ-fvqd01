package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if(number.toString().contains("3"))
            return "fizz";

        if(number.toString().contains("5"))
            return "buzz";

        if (number % 3 == 0 && number % 5 == 0)
            return "fizz buzz";

        if (number % 3 == 0)
            return "fizz";

        if (number % 5 == 0)
            return "buzz";

        return number.toString();
    }

}
