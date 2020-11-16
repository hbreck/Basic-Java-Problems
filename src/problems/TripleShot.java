package problems;

public class TripleShot {
    public static void main(String[] args) {
        // Create three booleans for the solution function
        boolean x = true;
        boolean y = true;
        boolean z = true;

        // Print solution function
        solution(x, y, z);


    }

    // This function checks if all three booleans being passed are true.
    public static boolean solution(boolean x, boolean y, boolean z){
        if(x == true && y == true && z == true){
            System.out.println("These conditions are all true");
            return true;
        }

        System.out.println("At least one of these are are false");
        return false;
    }
}
