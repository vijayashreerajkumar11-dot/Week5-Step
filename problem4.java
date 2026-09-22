<<<<<<< HEAD
public class problem4 {

    // Helper method to calculate average of one row
    private static double rowAverage(int[] row) {
        int sum = 0;

        for (int score : row) {
            sum = sum + score;
        }

        return (double) sum / row.length;
    }

    // Classify every row
    static String classifyRows(int[][] seatingScores, int threshold) {

        String result = "";

        for (int i = 0; i < seatingScores.length; i++) {

            // Calculate average only once for this row
            double average = rowAverage(seatingScores[i]);

            if (average < threshold) {
                result = result + "Row " + i + ": Quiet Zone";
            } else {
                result = result + "Row " + i + ": Buzzing Zone";
            }

            if (i < seatingScores.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] seatingScores = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };

        int threshold = 60;

        System.out.println(classifyRows(seatingScores, threshold));
=======
class IdCard {

    String name;
    int booksIssued;

    // Constructor
    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}


public class problem4 {

    public static void main(String[] args) {

        // Create one IdCard object for Ravi
        IdCard ravi = new IdCard("Ravi", 0);

        // duplicate points to the SAME object
        IdCard duplicate = ravi;

        // Change booksIssued using duplicate
        duplicate.booksIssued = 3;

        // Create a separate object with same values
        IdCard separate = new IdCard("Ravi", 3);

        // Print results
        System.out.println(
            "Ravi's booksIssued (via first variable): " + ravi.booksIssued
        );

        System.out.println(
            "duplicate == ravi: " + (duplicate == ravi)
        );

        System.out.println(
            "separate == ravi: " + (separate == ravi)
        );
>>>>>>> c0eef5d7687aa3bbed511b71bf9f17b11c8456ba
    }
}

