package problems;

public class FirstAndLast {
    public static void main(String[] args) {
        // Create string type variables to be used in the solution function
        String word = "Herman";
        String word1 = "maim";

        // Print solution function
        System.out.println(solution(word));
        System.out.println(solution(word1));

    }

    // This checks if the first letter and last letter in string are the same
    public static boolean solution(String word){
        if(word.isEmpty()){
            return true;
        }

        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);

        if(first == last)
            return true;
        return false;
    }
}
