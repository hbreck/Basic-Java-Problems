package problems;

import java.util.stream.Stream;

public class ReverseAStringReduce {
    public static void main(String[] args) {

        // Assign string type variable to the problem string
        String problem = "Herman";

        // Assign string type variable to solution string
        String result = solution(problem);

        //Print solution result
        System.out.println(result);
    }

    // This function uses a stream to reverse to the input string.
    // This uses reduce to produce the necessary
    // swaps to print out the reversed string.
    public static String solution(String word) {
        return Stream.of(word.split(""))
                .reduce("", (original, reverse) ->
                        reverse + original);
    }
}
