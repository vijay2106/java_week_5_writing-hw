import java.util.HashSet;

/**
 * Created by Jay Vaghani
 *
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
 */

public class Programme_8_HasSet {
    public static void main(String[] args) {
        // Create a HasSet object called numbers
        HashSet<Integer> number = new HashSet<Integer>();

        // Add values to the set
        number.add(4);
        number.add(7);
        number.add(8);


        //Show which number between 1 and 10 are in the set
        for (int i = 1; i <=10;i++) {
            if (number.contains(i)) {
                System.out.println(i + " is found in the set.");
            } else{
                System.out.println(i + " not found in the set.");
            }
        }
    }
}
