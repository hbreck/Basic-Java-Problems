package problems;

import java.util.Arrays;

public class SumAnArray {
    public static void main(String[] args) {
        // Assign string type array variable to the problem string
        int[] problem = {1, 2, 3, 4, 5, 6, 7};

        // Assign string type variable to solution string
        int result = solution(problem);

        //Print solution result
        System.out.println(result);

    }

    //
    public static int solution(int[] nums) {
        return Arrays.stream(nums).reduce(0, (element, sum) -> element + sum);
    }
}
