package problems;

import java.util.Arrays;

public class RemoveOddsFromArray {
    public static void main(String[] args) {

        // Intialize
        int[] set = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = solution(set);

        for (int i: result) {
            System.out.println(i);
        }

    }

    public static int[] solution(int[] nums) {
        return Arrays.stream(nums).filter(x -> x % 2 == 0).toArray();
    }
}
