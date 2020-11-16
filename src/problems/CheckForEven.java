package problems;

public class CheckForEven {
    public static void main(String[] args) {
        // Create int type variable to be used in solution function
        int number = 7;

        // Print solution
        solution(number);

    }

    // This function takes in an integer and determines if it is even or odd
    public static String solution(int number){
        if(number % 2 == 0)
            return "This number is even";
        return "This number is odd";
    }
}
