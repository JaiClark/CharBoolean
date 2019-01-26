/**
 * CharBoolean
 */
public class CharBoolean {

    public static void main(String[] args){
        // unicode character
        // width of 16 (2 bytes)
        char myChar = '\u00A9';

        // When using char the quotes have to be single quotes
        char myChar2 = '\u00AE';
        System.out.println("Unicode output was: " + myChar + " " + myChar2);
        System.out.println("Unicode output was: " + myChar2);

        // boolean myBoolean = false;
        // boolean isMale = true;

        // the 8 Primitive Data types
        // byte, short, int, long, float, double, char, boolean

        String myString = "This is a string";
        System.out.println(myString);

        String lastString ="10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

    }
}