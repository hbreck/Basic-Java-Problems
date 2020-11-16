package problems;

public class LesserNumber {
    public static void main(String[] args) {
        // Create variables to be used in solution function
        int x = 6;
        int y = 5;

        // Print solution function
        solution(x, y);
    }

    // This function compares two integers and prints the least of the two
    public static void solution(int x, int y){
        if(x < y){
            System.out.println(x + " is lesser than " + y);
        }
            System.out.println(y + " is lesser than " + x);
    }
}
