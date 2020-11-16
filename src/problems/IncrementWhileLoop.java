package problems;

public class IncrementWhileLoop {
    public static void main(String[] args) {
        // Create int type variables to be used in the solution function
        int from = 5;
        int to = 10;

        // Print solution function
        System.out.println(solution(from, to));
        System.out.println(solution(to, from));
    }

    // This function takes two integers and concatenates to
    // string in the range between the to and from arguments
    public static String solution(int from, int to){
        if(from > to)
            return "";
        else if(from == to){
            String convert = Integer.toString(from);
            return convert;
        }

        String str = "";

        while(from < (to + 1)){
            str = str + from;
            from++;
        }
        return str;
    }
}
