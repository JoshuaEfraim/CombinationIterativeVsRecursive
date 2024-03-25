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

//Example output: 
/**
 * 
Enter number: 4
Combinations:
[a, 1]
[a, 2]
[a, 3]
[a, 4]
[b, 1]
[b, 2]
[b, 3]
[b, 4]
[c, 1]
[c, 2]
[c, 3]
[c, 4]
[d, 1]
[d, 2]
[d, 3]
[d, 4]
[e, 1]
[e, 2]
[e, 3]
[e, 4]
[f, 1]
[f, 2]
[f, 3]
[f, 4]
[g, 1]
[g, 2]
[g, 3]
[g, 4]
[h, 1]
[h, 2]
[h, 3]
[h, 4]
[i, 1]
[i, 2]
[i, 3]
[i, 4]
[j, 1]
[j, 2]
[j, 3]
[j, 4]
[k, 1]
[k, 2]
[k, 3]
[k, 4]
[l, 1]
[l, 2]
[l, 3]
[l, 4]
[m, 1]
[m, 2]
[m, 3]
[m, 4]
[n, 1]
[n, 2]
[n, 3]
[n, 4]
[o, 1]
[o, 2]
[o, 3]
[o, 4]
[p, 1]
[p, 2]
[p, 3]
[p, 4]
[q, 1]
[q, 2]
[q, 3]
[q, 4]
[r, 1]
[r, 2]
[r, 3]
[r, 4]
[s, 1]
[s, 2]
[s, 3]
[s, 4]
[t, 1]
[t, 2]
[t, 3]
[t, 4]
[u, 1]
[u, 2]
[u, 3]
[u, 4]
[v, 1]
[v, 2]
[v, 3]
[v, 4]
[w, 1]
[w, 2]
[w, 3]
[w, 4]
[x, 1]
[x, 2]
[x, 3]
[x, 4]
[y, 1]
[y, 2]
[y, 3]
[y, 4]
[z, 1]
[z, 2]
[z, 3]
[z, 4]
 */
