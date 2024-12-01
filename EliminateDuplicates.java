import java.util.ArrayList;
import java.util.Scanner;

public class EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read ten integers from the user
        int[] list = new int[10];
        System.out.println("Enter ten integers:");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        // Eliminate duplicates and get the new array
        int[] newArray = eliminateDuplicates(list);

        // Display the result
        System.out.println("Array after eliminating duplicates:");
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }

    // Method to eliminate duplicate values from an array
    public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int value : list) {
            if (!uniqueList.contains(value)) {
                uniqueList.add(value);
            }
        }

        // Convert the ArrayList back to an array
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }
        return result;
    }
}
