package Week07;

/*
 * Mock CW2 Set 3
 */

public class Mock {

    // Mock CW2 Set 3
    // Complete the method appearOnce that on input a non-empty string,
    // prints the first character that appears exactly once in the string.
    // You may assume that the input string will contain at least one such character.
    // You must use String methods in lecture notes.
    // You must NOT use StringBuilder or Regular Expression methods.
    public static char appearOnce(String input) {
        char rs = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))){
                rs = input.charAt(i);
                break;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        String input = "abcdbaddab";
        System.out.println(appearOnce(input)); // 'c'
        input = "abcdcb";
        System.out.println(appearOnce(input)); // 'a'
        input = "aaxx";
        System.out.println(appearOnce(input)); // 'x'
        int A = 1;

        // add your own test cases



    }
}