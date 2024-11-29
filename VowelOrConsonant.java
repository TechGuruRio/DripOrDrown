import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        // Check if the letter is a vowel or consonant
        if (isVowel(letter)) {
            System.out.println(letter + " is a vowel.");
        } else if (Character.isLetter(letter)) {
            System.out.println(letter + " is a consonant.");
        } else {
            System.out.println(letter + " is not a valid letter.");
        }

        input.close();
    }

    // Method to check if a letter is a vowel
    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u');
    }
}
