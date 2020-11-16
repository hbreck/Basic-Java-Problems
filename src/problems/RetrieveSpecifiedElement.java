package problems;

import java.util.ArrayList;

public class RetrieveSpecifiedElement {
    public static void main(String[] args) {
        // Create variables to be used in the solution function
        ArrayList<Integer> problem = new ArrayList<>();
        ArrayList<Integer> problem1 = new ArrayList<>();

        // Add integers to the Arraylist
        problem.add(18);
        problem.add(10);
        problem.add(20);

        // Assign int type variable to solution function
        int result = solution(problem);
        int result1 = solution(problem1);

        // Prints the solution function
        System.out.println("The first element in the Arraylist is: ");
        System.out.println(result);
        System.out.println(problem1);
    }

    // This function takes in an Arraylist and returns the first element in the Arraylist
    public static int solution(ArrayList<Integer> list){
        if(list.isEmpty())
            return 0;

        return list.get(0);
    }
}
