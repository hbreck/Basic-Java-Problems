package problems;

public class StringConcatAppend {
    public static void main(String[] args) {
        // Create string type variable to be used in solution function
        String speech = "Barking";

        // Print solution function
        System.out.println(solution(speech));

    }

    // This function takes a string variable and appends it to front of another string
    public static String solution(String str){
        return str + " dogs";
    }
}
