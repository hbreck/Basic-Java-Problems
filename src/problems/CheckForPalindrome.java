package problems;

public class CheckForPalindrome {
    public static void main(String[] args) {
        // Create string type variables to be used in the solution function
        String pally = "civic";
        String pally2 = "A";

        // Print solution function
        System.out.println(solution(pally));
        System.out.println(solution(pally2));

    }

    // This function checks if a string is a palindrome
    public static boolean solution(String pally){
        if(pally.length() == 1 || pally.length() <= 0)
            return true;

        int i = 0, j = pally.length() - 1;

        while (i < j) {
            if (pally.charAt(i) != pally.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
