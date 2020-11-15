package problems;

import java.util.Arrays;

public class SquaringAnArray {
    public static void main(String[] args) {
        // Create problem array
        int[] problem = {1, 2, 3, 4, 5, 6, 7};

        // Assign sn array type variable to the solution function
        int[] result = solution(problem);

        // Print out result array
        for (int i: result) {
            System.out.println(i);
        }

    }
    // This function makes us of a map stream
    // to square every element in a integer array
    public static int[] solution(int[] nums) {
        return Arrays.stream(nums).map(x -> x * x).toArray();
    }
}
