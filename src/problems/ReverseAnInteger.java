package problems;

public class ReverseAnInteger {
    public static void main(String[] args) {
        // Create a int type variable to be used in the solution function
        int number = -14;

        // Print solution function
        System.out.println(solution(number));

    }

    //This function reverse a integer number
    public static String solution(int number){

        String convert = String.valueOf(number);
        String reverse = "";

        for(int i =  convert.length() - 1; i >= 0; i--){
            reverse = reverse + convert.charAt(i);
        }

        return reverse;
    }
}
