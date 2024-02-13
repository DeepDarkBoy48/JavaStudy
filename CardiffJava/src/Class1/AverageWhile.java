package Class1;

// Average2.java
// Calculate the average of the entered integers using a while loop.
// -1 to exit.
import java.util.Scanner;

public class AverageWhile {
   public static void main(String[] args) {
      // Create scanner for std in
      Scanner in = new Scanner(System.in);

      // Initialise variables.
      int total = 0; // Total of all entries.
      int numberOfEntries = 0; // Number of entries.

      // Accept and total entries until -1 entered.
      System.out.print("Enter value (-1 to finish) : ");
      int lastEntry = in.nextInt();
      while (lastEntry != -1) {
         total += lastEntry;
         numberOfEntries++;
         System.out.print("Enter value (-1 to finish) : ");
         lastEntry = in.nextInt();
      }

      // Output average only if there is at least 1 entry
      // (to avoid dividing by zero).
      if (numberOfEntries > 0) {
         double average = (double) total / numberOfEntries;
         System.out.printf("The average is %.2f%n", average);
      }
   }
}
