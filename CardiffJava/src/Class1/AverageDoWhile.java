package Class1;

// Average3.java
// Calculate the average of the entered integers using a do while loop.
import java.util.Scanner;

public class AverageDoWhile {
   public static void main(String[] args) {
      // Create scanner for std in
      Scanner in = new Scanner(System.in);

      // Initialise variables.
      int total = 0; // Total of all entries.
      int numberOfEntries = 0; // Number of entries.

      // Get all entries and calculate and display average. Prompt
      // user for another entry
      do {
         System.out.print("Enter value : ");
         total += in.nextInt();
         numberOfEntries++;
         double average = (double) total / numberOfEntries;
         System.out.printf("Average is %.2f %n ", average);
         System.out.print("Enter another mark (yes/no) : ");
      } while (in.next().equals("yes"));

      // Output average.
      double average = (double) total / numberOfEntries;
      System.out.printf("Average is %.2f %n ", average);
   }
}
