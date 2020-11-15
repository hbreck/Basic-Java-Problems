package problems;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterMap {
    public static void main(String[] args) {
        //Create Arraylist of Arraylists and call it problem to store Arraylists
        ArrayList<ArrayList<Integer>> problem = new ArrayList<>();

        //Create and populate Arraylists to store in problem Arraylist of Arraylists
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(5);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(4);
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(5);
        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.add(3);
        arr4.add(6);
        arr4.add(10);
        ArrayList<Integer> arr5 = new ArrayList<>();
        arr5.add(10);
        arr5.add(2);

        //Add Arraylists to problem Arraylist of Arraylists
        problem.add(arr1);
        problem.add(arr2);
        problem.add(arr3);
        problem.add(arr4);
        problem.add(arr5);

        //Assign Object [] type to solution function and call it result
        Object[] result = solution(problem);

        //Print result Arraylist
        for (Object i: result) {
            System.out.println(i);
        }

    }

    public static Object[] solution(ArrayList<ArrayList<Integer>> listolists) {
        // This function makes use of the filter and map stream functions
        // to filter out the odd number length and then uses to
        // multiply the filtered arrays by 10
        return listolists.stream().filter(list -> list.size() % 2 != 0)
                .map(list -> list.stream().map(num -> num * 10)
                        .collect(Collectors
                                .toCollection(ArrayList::new))).toArray();
    }
}
