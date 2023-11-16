package Week06;

public class LectureDemo_char {
    public static void main(String[] args) {
        char firstLetter = 'A';
        char five = '5';
        char newLine = '\n';
        System.out.println(Character.isLetter(firstLetter)); //true
        System.out.println(Character.isDigit(five)); //true
        System.out.println(Character.isWhitespace(newLine)); //true
        System.out.println(Character.isUpperCase(firstLetter)); //  true
        System.out.println(Character.isLowerCase(firstLetter)); // false'
       //Char toUpperCase(char c)
        //○ Char toLowerCase(char c)
        //○ String toString(char c)
        //to uppercase
        //to lowercase
        //to a String object consist of one character
    }
}
