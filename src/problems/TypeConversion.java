package problems;

public class TypeConversion {
    public static void main(String[] args) {
        // Create Object type variables to be used in the solution function
        Object ob = "12";
        Object ob1 = 12;
        Object ob2 = 'c';

        // Print out the class types before using the solution function
        System.out.println(ob.getClass());
        System.out.println(ob1.getClass());
        System.out.println(ob2.getClass());
        System.out.println("");

        // Using the solution function to convert
        // the data types of the variables
        Object sol = solution(ob);
        Object sol1 = solution(ob1);
        Object sol2 = solution(ob2);

        // Print out the class types after using the solution function
        System.out.println(sol.getClass());
        System.out.println(sol1.getClass());
        System.out.println(sol2.getClass());
    }

    // This function takes in an Object type and converts it based on its datatype
    public static Object solution(Object object){
        if(object instanceof Integer){
            int instance = (Integer) object;
            String convert = String.valueOf(instance);
            return convert;
        }

        if(object instanceof String){
            String instance = (String) object;
            int convert = Integer.parseInt(instance);
            return convert;
        }

        if(object instanceof Character){
            Character instance = (Character) object;
            String convert = Character.toString(instance);
            return convert;
        }

        return null;
    }
}
