package problems;

public class HelloWorld {
    public static void main(String[] args) {
        // Create string to used in function
        String greeting = "Hello";

        // Print solution function
        System.out.println(solution(greeting));

    }

    //This function takes in a string as an argument and then returns
    // the string concatenated to the string " world"
    public static String solution(String hello){
        return hello + " world!";
    }
}
