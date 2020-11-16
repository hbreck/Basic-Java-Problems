package problems;

public class TripleShotAgain {
    public static void main(String[] args) {
        // Create three booleans for the solution function
        boolean x = false;
        boolean y = false;
        boolean z = false;

        // Print solution function
        solution(x, y, z);

    }

    // This function checks if at least one of the boolean being passed is true
    public static boolean solution(boolean x, boolean y, boolean z){
        if(x == true || y == true || z == true){
            System.out.println("These conditions are all true");
            return true;
        }
        System.out.println("None of these boolean are true");
        return false;
    }
}
