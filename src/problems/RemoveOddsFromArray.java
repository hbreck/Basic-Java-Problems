package problems;

import java.util.Arrays;

public class RemoveOddsFromArray {
    public static void main(String[] args) {

        // Intialize the array problem set
        int[] set = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Assign variable to solution set
        int[] result = solution(set);

        // Print out the solution set
        for (int i: result) {
            System.out.println(i);
        }

    }

    // This function makes use of streams to filter
    // out the odd integers in a given array
    public static int[] solution(int[] nums) {
        return Arrays.stream(nums).filter(x -> x % 2 == 0).toArray();
    }
}
