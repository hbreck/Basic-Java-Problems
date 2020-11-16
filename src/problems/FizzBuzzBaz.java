package problems;

public class FizzBuzzBaz {
    public static void main(String[] args) {
        // Create int type variables for the solution function
        int number = 15;
        int number1 = 7;

        // Print the solution function
        System.out.println(solution(number));
        System.out.println(solution(number1));

    }

    // This function takes an integer and checks if it is divisible by 3, 5 or both.
    public static String solution(int fuzzy){
        if(fuzzy % 3 == 0 && fuzzy % 5 == 0)
            return "fizz buzz baz";
        else if(fuzzy % 5 == 0)
            return "buzz";
        else if(fuzzy % 3 == 0)
            return "fizz";

        return "Fizzled";
    }
}
