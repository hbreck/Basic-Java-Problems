package problems;

import java.util.ArrayList;

public class IterateThroughArrayList {
    public static void main(String[] args) {
        // Create an Arraylist to be used in the solution function
        ArrayList<String> sentence = new ArrayList<>();

        // Add strings to the Arraylist
        sentence.add("My");
        sentence.add("Dog");
        sentence.add("has");
        sentence.add("fleas.");

        // Print solution function
        solution(sentence);



    }

    // This function traverses and prints out the contents of an Arraylist
    public static void solution(ArrayList<String> myList){
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

    }
}
