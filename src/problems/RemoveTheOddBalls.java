package problems;

import java.util.ArrayList;

public class RemoveTheOddBalls {
    public static void main(String[] args) {
        // Create Arraylist variable for problem Arraylist
        ArrayList<String> problem = new ArrayList<>();

        // Add strings for problem Arraylist
        problem.add("Herman");
        problem.add("Breckenridge");
        problem.add("ate");
        problem.add("hi");
        problem.add("create");
        problem.add("treat");

        // Create Object type array variable for solution function
        Object[] result = solution(problem);

        // Print result array
        for (Object print: result) {
            System.out.println(print);
        }
    }

    // This function uses of the filter map stream to filter out
    // odd number length strings contain in an Arraylist.
    public static Object[] solution(ArrayList<String> words) {
        return words.stream().filter(e -> e.length() % 2 == 0).toArray();
    }
}
