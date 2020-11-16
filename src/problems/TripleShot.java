package problems;

public class TripleShot {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;
        boolean z = true;

        solution(x, y, z);


    }

    public static boolean solution(boolean x, boolean y, boolean z){
        if(x == true && y == true && z == true){
            System.out.println("These conditions are all true");
            return true;
        }

        System.out.println("At least one of these are are false");
        return false;
    }
}
