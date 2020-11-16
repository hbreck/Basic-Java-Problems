package problems;

public class CheckingAGrade {
    public static void main(String[] args) {
        // Create int type variables to be used in the solution
        int grade = 60;
        int grade1 = 78;

        // Print solution function
        System.out.println(solution(grade));
        System.out.println(solution(grade1));

    }

    // This function checks a grade if it is an A, a B, a C, or a failing grade
    public static String solution(int grade){
        if(grade >= 90)
            return "A";
        else if(grade >= 80)
            return "B";
        else if(grade >= 70)
            return "C";
        return "FAILURE";
    }
}
