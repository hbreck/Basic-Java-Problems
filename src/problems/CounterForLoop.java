package problems;

public class CounterForLoop {
    public static void main(String[] args) {
        // Create a int type variable to be used in the solution function
        int count = 15;

        // Print solution function
        System.out.println(solution(count));

    }

    // This function takes an integer and appends the integer to string for each iteration
    public static String solution(int count){
        String str = "";
        if(count == 0)
            return "0";

        for(int i = count; i >= 0; i--){
            str = str + i;
        }
        return str;
    }
}
