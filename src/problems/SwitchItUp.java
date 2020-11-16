package problems;

public class SwitchItUp {
    public static void main(String[] args) {
        // Create an int type variable to be used in the solution function
        int number = 4;

        // Print soltuion function
        System.out.println(solution(number));

    }

    // This function checks if an integer is  1, 2, 3, or 4.
    public static String solution(int x) {
        switch (x) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            default:
                return "none matched";

        }
    }
}
