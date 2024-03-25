import java.util.*;

public class AlphabetCombinationIterative {

    // Method to generate combination of alphabet and number
    public static List<List<String>> generateCombinations(int comboNum) {

        // Create a 2d Arraylist (Alphabet character and numeric
        List<List<String>> result = new ArrayList<>();

        // First for loop to iterate through all 26 letters of the alphabets
        for (int i = 1; i <= 26; i++) {

            // Declare a variable that contains the alphabet char of each number 1 to 26
            String alphabet = getAlphabet(i);
            // Second for loop to iterate based on the amount of times the user wants
            for (int j = 1; j <= comboNum; j++) {

                // Declare an arraylist to store the alphabet and number
                List<String> combination = new ArrayList<>();
                // Add alphabet first
                combination.add(alphabet);
                // Then add the number, also convert the number into a string
                combination.add(Integer.toString(j));
                // Then add the "combination" list to the 2d Arraylist "result"
                result.add(combination);
            }
        }
        // Return the 2d Arraylist
        return result;
    }

    private static String getAlphabet(int num) {
        return Character.toString((char) ('a' + num - 1));
    }
    public static void main(String[] args) {
        // Takes input from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int comboNum = scan.nextInt();
        // Initialize the 2D Arraylist
        List<List<String>> combinations = generateCombinations(comboNum);
        System.out.println("Combinations: ");
        for (List<String> combination : combinations) {
            System.out.println(combination);
        }
    }
}