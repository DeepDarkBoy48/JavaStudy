package Class1;

// Average.java
// Calculate the average of the entered integers.
import java.util.Scanner;

public class AverageFor {
   public static void main(String[] args) {
      // Create scanner for std in
      Scanner in = new Scanner(System.in);

      // Initialise variables.
      int total = 0; // Total of all entries.
      System.out.print("Enter number of entries : ");
      int numberOfEntries = in.nextInt(); // Number of entries.

      // Check for a valid number of entries.
      if (numberOfEntries <= 0) {
         System.out.println("No entries");
         System.exit(0);
      }

      // Get all entries and calculate total
      for (int i = 0; i < numberOfEntries; i++) {
         System.out.print("Enter next value : ");
         total += in.nextInt();
      }

      // Output average.
      System.out.printf("The average is %.2f %n",
            (float) total / numberOfEntries);
   }
}
