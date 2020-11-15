package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduce {
    public static void main(String[] args) {
        //Create Arraylist of Arraylists and call it problem
        ArrayList<ArrayList<Integer>> problem = new ArrayList<>();

        //Create Arraylists and add integers to them to be added to problem Arraylist
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(4);
        arr2.add(9);
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(10);
        arr3.add(9);
        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.add(5);
        arr4.add(10);
        ArrayList<Integer> arr5 = new ArrayList<>();
        arr5.add(10);
        arr5.add(20);

        //Add Arraylists to problem Arraylist
        problem.add(arr1);
        problem.add(arr2);
        problem.add(arr3);
        problem.add(arr4);
        problem.add(arr5);

        //Assign int[] data type to solution function
        int[] result = solution(problem);

        // Counter to keep track of Arraylists
        int j = 1;

        //Print result Arraylist
        for (int i: result) {
            System.out.println("Sum of arr " + j + " is " + i);
            System.out.println(i);
            j++;
        }
    }

    //This function uses map stream function to turn containing Arraylist in innerNums
    // to a stream and then reduce takes the result and adds the elements of each Arraylist
    public static int[] solution(ArrayList<ArrayList<Integer>> innerNums){
        List<Integer> nums = innerNums.stream()
                .map(list -> list.stream().reduce(0,(sum, num) -> sum + num))
                .collect(Collectors.toList());

        int[] array = new int[nums.size()];
        for(int i = 0; i < array.length; i++){
            array[i] = nums.get(i);
        }
        return array;
    }
}
