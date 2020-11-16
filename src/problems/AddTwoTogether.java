package problems;

public class AddTwoTogether {
    public static void main(String[] args) {
        //Create two variables, x and y to be used in the solution function
        int x = 5;
        int y = 10;

        // Pint solution function
        System.out.println(solution(x, y));

    }

    // This function takes two integers and returns the sum of these two integers
    public static int solution(int x, int y){
        return x + y;
    }
}
