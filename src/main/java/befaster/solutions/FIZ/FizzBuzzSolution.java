package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
String result="";

        if(number % 3 == 0 || number.toString().contains("3"))
            result+= "fizz";

        if(number.toString().contains("5"))
            result+= "buzz";

        if (number % 3 == 0 && number % 5 == 0)
            return "fizz buzz";

        if ()
            return "fizz";

        if (number % 5 == 0)
            return "buzz";

        return number.toString();
    }

}
