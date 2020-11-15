package problems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QueryTheFile {
    public static void main(String[] args) throws IOException {
        // Assign String Arraylist date type variable to solution function
        ArrayList<String> result = solution();

        // Print result Arraylist
        for (String i: result) {
            System.out.println(i);
        }

    }

    // This function reads input from a text file and filters
    // out strings that contain the number 2.
    // This is done with the filter stream method.
    public static ArrayList<String> solution() throws IOException {
        // The text file used in this function is stored in the The string value used fro the file name is relative.
        String fileName = "C:\\Users\\hbreck\\Documents\\Basic-Java-Problems\\src\\problems\\textfiles\\filter_problem.text";
        Stream<String> stream = Files.lines(Paths.get(fileName));

        return stream.filter(string -> !string.contains("2"))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
