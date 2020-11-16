package problems;

public class StringConcat {
    public static void main(String[] args) {
        // Create string variable to be used in the solution function
        String talk = "meow";

        // Print solution function
        System.out.println(solution(talk));
    }

    // This function takes a string argument and
    // returns it concatenated to the string "cats "
    public static String solution(String str){
        return "cats " + str;
    }
}
