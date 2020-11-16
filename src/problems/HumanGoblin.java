package problems;

public class HumanGoblin {
    public static void main(String[] args) {
        //Create string variable to be used in solution function
        String goblin = "goblin";

        //Print solution function
        System.out.println(solution(goblin));

    }

    //This function takes in a string and returns a message based on the input string
    public static String solution(String str){
        if(str == "goblin")
            return "Attack the Goblin!";
        return "You aRe one of us!";
    }
}
