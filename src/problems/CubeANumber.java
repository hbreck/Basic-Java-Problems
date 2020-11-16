package problems;

public class CubeANumber {
    public static void main(String[] args) {
        // Create a variable to be used in solution function
        int x = 5;

        // Print solution function
        System.out.println(solution(x));
    }

    // This function takes an integer and returns the cube of that number
    public static int solution(int num){
        return num * num * num;
    }
}
