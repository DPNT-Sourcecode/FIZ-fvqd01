package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String result = "";
        if (number % 3 == 0 || number.toString().contains("3"))
            result = "fizz";

        if (number % 5 == 0 || number.toString().contains("5"))
            result = result == "" ? "buzz" : "fizz buzz";

        if (number >  10 && numberIdentical(number) ))
            result = result == "" ? "buzz" : "fizz buzz";

        return result == "" ? number.toString() : result;
    }

    private boolean numberIdentical(Integer number) {
        String strNumber=number.toString();
        String chr="";

        for (int i=0; i<strNumber.length();i++){

            chr=strNumber.substring()

            if ()


        }
    }

}
