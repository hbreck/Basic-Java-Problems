package problems;

public class MaxNumber {
    public static void main(String[] args) {
        // Create variables to be used in solution function
        int x = 5;
        int y = 6;

        // Print solution function
        solution(x, y);
    }

    // This function compares two integers and prints the greatest of the two
    public static void solution(int a, int b){
        if(a > b){
            System.out.println(a + " is greater than " + b);
        }

        System.out.println(b + " is greater than " + a);
    }
}
