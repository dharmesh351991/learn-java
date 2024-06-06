import java.util.ArrayList;

public class LearnWrapperClasses {
    public static void main(String[] args) {
        //Autoboxing : Converting primitive int to Integer Object
        int primInt = 5;
        Integer wrapperInt = primInt;
        //Unboxing : Converting Integer Object back to Primitive int
        int newPrimitiveInt = wrapperInt;

        //Using wrapper classes with collections
        ArrayList<Integer> studentMarks = new ArrayList<>();
        studentMarks.add(10);   // Autoboxing int to Integer
        studentMarks.add(30);

        int val = studentMarks.get(0); //unboxing :

        // Printing values
        System.out.println("Primitive int: " + primInt);
        System.out.println("Wrapped Integer: " + wrapperInt);
        System.out.println("New Primitive int: " + newPrimitiveInt);
        System.out.println("Value from ArrayList: " + val);

        // Using wrapper class methods
        Integer integerValue = Integer.valueOf("100");
        int parsedValue = Integer.parseInt("200");

        System.out.println("Integer value from string: " + integerValue);
        System.out.println("Parsed int value from string: " + parsedValue);

    }
}
