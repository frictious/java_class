public class Main {
    public static void main(String[] args) {
        // Single line Comments
        /**
         * This is going to be the first class we will take
         * using an intelligent IDE
         */

        /**
         * Data Types
         * Long
         * Short
         * Int
         * Byte
         * Float
         * Double
         * Boolean
         * Char
         */

        // Variable is a name for a storage location in memory

        // Declaration of variables
        byte age;

        // Initialization of variables
        age = 32;

        // Printing the value stored in the variable
        System.out.println(age); // Printing the value of age
        System.out.println("Hi Ezekiel, your age is " + age); // Concatenation (joining strings and variables together)

        // Declaration of variables
        byte firstNumber, secondNumber;
        int answer;

        // Initialization of variables
        firstNumber = 43;
        secondNumber = 78;
        answer = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + answer);

        System.out.println("\n\n\n\n");

        // CLASS EXERCISE
        // Declaration of variables
        int fn, sn;
        int ans;

        // Initialization of variables
        fn = 300;
        sn = 100;
        // ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
        ans = fn + sn;
        System.out.println("Addition: " + ans);
        ans = fn - sn;
        System.out.println("Subtraction: " + ans);
        ans = fn * sn;
        System.out.println("Multiplication: " + ans);
        ans = sn / fn; // Whole number
        System.out.println("Division: " + ans + "." + (sn % fn));
        // ans = sn % fn; // Remainder
        // System.out.println("Remainder: " + ans);



    }


}