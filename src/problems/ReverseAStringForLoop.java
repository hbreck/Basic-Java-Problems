package problems;

public class ReverseAStringForLoop {
    public static void main(String[] args) {
        // Create a variable to be used in the solution function
        String name = "Herman";

        //Print solution function
        System.out.println(solution(name));

    }

    // This function reverses a string using a for loop
    public static String solution(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}
