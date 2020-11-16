package problems;

public class StringInterpolation {
    public static void main(String[] args) {
        // Create string variable to be used in solution function
        String name = "Herman";

        // Print solution function
        System.out.println(solution(name));

    }

    // This function makes use of the format function to insert a string
    public static String solution(String str){
        return String.format(str, "INSERTED");
    }
}
