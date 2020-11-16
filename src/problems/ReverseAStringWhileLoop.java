package problems;

public class ReverseAStringWhileLoop {
    public static void main(String[] args) {
        // Create a variable to be used in the solution function
        String name = "Herman";

        //Print solution function
        System.out.println(solution(name));

    }

    // This function reverses a string using a while loop
    public static String solution(String str){
        String reverse = "";
        int i = str.length();
        while(i > 0){
            reverse = reverse + str.charAt(i - 1);
            i--;
        }
        return reverse;
    }
}
