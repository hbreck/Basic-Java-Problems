import java.util.ArrayList;
import java.util.stream.Collectors;

public class IncrementTheData {
    public static void main(String[] args) {
        // Create problem Arraylist
        ArrayList<Integer> problem = new ArrayList<>();

        // Add integers to Arraylist
        problem.add(1);
        problem.add(2);
        problem.add(3);
        problem.add(4);
        problem.add(5);
        problem.add(6);
        problem.add(7);

        // Assign variable to result Arraylist
        ArrayList<Integer> result = (ArrayList<Integer>) solution(problem);

        // Print result Arraylist
        for (int i: result) {
            System.out.println(i);
        }

    }

    // This function uses a stream to increment
    // every element in the Arraylist by 10.
    // This makes use of the map function
    // to map every element and increment it by 10.
    public static Object solution(ArrayList<Integer> nums) {
        return nums.stream().map(x -> x + 10).collect(Collectors.toList());
    }
}
