package problems;

public class LongestString {
    public static void main(String[] args) {
        // Create the string variables to be used in the solution function
        String first = "Herman";
        String last = "Breckenridge";

        // Print solution function
        System.out.println(solution(first, last));
    }

    // This function takes two t=string and returns the longest of the two of them
    public static String solution(String firstWord, String secondWord){
        if(firstWord.length() > secondWord.length())
            return "The longest string is " + firstWord;
        return "The longest string is " + secondWord;
    }
}
