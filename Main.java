public class Main {
    public static void main(String[] args) {
        // Boolean is either one of two values (eg. True or False)
        // They can be used as just Values
        boolean NameEntered = false;
        boolean BillPayed = true;

        // and also in Boolean Expressions
        int x = 2;
        int y = 5;
        if (x < y) { // returns true as 2 is less than 5
            System.out.println(BillPayed);
        } else {
            System.out.println(NameEntered);
        }

        // This leads to if and else statements, fun

        /*
         * Less than: a < b
         * Less than or equal to: a <= b
         * Greater than: a > b
         * Greater than or equal to: a >= b
         * Equal to a == b
         * Not Equal to: a != b
         */

        // IF statements have a condition, which if returns true, the code inside the
        // curly braces runs. eg.
        if (x >= 2) {
            System.out.println("5 is greater than 2! :)");
        } else if (y > 2) { // this runs if the condition for the if statemtent is false
            x--; // decrements x
        } else {
            System.out.println("Potato");
        }

        // Short-hand if Statements are something else..
        // they are know as ternary operators due to it consisting of three operands
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        // here the : represents "else do this"
        // and the ? represents "if true do this"
        // the result is stored in the STRING result
        System.out.println(result);
    }
}