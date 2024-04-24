/**
 * The main program.
 * 
 * @author Andi Cucka
 * @version 1.0
 * @since 2024-04-13
 */
public class Main {

    public static String reverseString(String stringToReverse) {
        if (stringToReverse.isEmpty()) {
            return "";
        } else {
            char firstCharacterOfString = stringToReverse.charAt(0);
            String restOfString = stringToReverse.substring(1);
            return reverseString(restOfString) + firstCharacterOfString;
        }
    }

    public static void main(String[] args) {
        String aString = "recursion";

        System.out.println("");
        System.out.println("The original string is: " + aString);
        String theReversedString = reverseString(aString);
        System.out.println("The reversed string is: " + theReversedString);

        System.out.println("\nDone.");
    }
}

