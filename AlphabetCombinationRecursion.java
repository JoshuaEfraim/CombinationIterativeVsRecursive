import java.util.*;

public class AlphabetCombinationRecursion {
    public static void main(String[] args) {

        //Asks the user for their input of the maximum number
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number: ");
        int maxNumber = scanner.nextInt();
        scanner.close(); 


        //Creating the list of list of strings for collecting all the combinations
        List<List<String>> combinations = new ArrayList<>();

        generateCombinations(combinations, maxNumber, 'a');

        
        //Prints out the list of combinations
        System.out.println("List of Combinations:");
        for (List<String> combination : combinations) {
            System.out.println(combination);
        }
    }


    private static void generateCombinations(List<List<String>> combinations, int maxNumber, char ch) {
        //Stops when the characters finishes at Z
        if (ch > 'z') {
            return;
        }


        //For loop which combines the alphabet with the numbers iterating from 1 up to the input
        for (int i = 1; i <= maxNumber; i++) {
            //This line creates an arraylist for one combination
            List<String> combination = new ArrayList<>();
            //This line adds the alphabet which is converted to a String first into the arraylist
            combination.add(Character.toString(ch));
            //This line adds the number which is converted to a String first into the arraylist
            combination.add(Integer.toString(i));
            //Each of the arraylist is then added to the list of list of strings 
            combinations.add(combination);
        }

        //This is the recursive part where the current character is incremented by 1 
        generateCombinations(combinations, maxNumber, (char)(ch + 1));
    }
}

//Example output: 
/**
 * 
Enter the maximum number: 4
List of Combinations:
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