package DMDEV.ForWhileWork;

public class AlphaBet {
    public static void main(String[] args) {
        alphaBet();
        char value = 'c';
        System.out.println((int)value);
    }
    
    public static void alphaBet() {
        for (char letter = 'b'; !isVowel(letter) ; letter++) {
            System.out.print(letter);
        }
    }

    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'y';

    }
}
