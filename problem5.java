<<<<<<< HEAD
import java.util.Arrays;

class Candidate implements Comparable<Candidate> {

    // Private fields for encapsulation
    private String name;
    private double cgpa;
    private int codingScore;

    // Constructor
    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    // CGPA-only eligibility check
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    // Combined CGPA and coding-score eligibility check
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    // Calculate composite score
    private double compositeScore() {
        return cgpa * 10 + codingScore;
    }

    // Compare candidates by composite score in descending order
    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.compositeScore(), this.compositeScore());
    }

    // Shortlist and rank candidates
    static String shortlistAndRank(Candidate[] candidates) {

        Candidate[] shortlisted = new Candidate[candidates.length];
        int count = 0;

        // Find eligible candidates
        for (Candidate candidate : candidates) {

            if (isEligible(candidate.cgpa) ||
                isEligible(candidate.cgpa, candidate.codingScore)) {

                shortlisted[count] = candidate;
                count++;
            }
        }

        // Create an array containing only shortlisted candidates
        Candidate[] finalList = Arrays.copyOf(shortlisted, count);

        // Sort using compareTo()
        Arrays.sort(finalList);

        // Create output
        String result = "";

        for (int i = 0; i < finalList.length; i++) {

            result = result
                    + (i + 1)
                    + ". "
                    + finalList[i].name
                    + " ("
                    + finalList[i].compositeScore()
                    + ")";

            if (i < finalList.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }
}

=======
class Student {

    // Instance fields
    String name;
    int attendance;

    // Static fields - shared by all students
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    // Constructor
    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;

        // Increment student count
        studentCount++;
    }

    // Static method
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}


>>>>>>> c0eef5d7687aa3bbed511b71bf9f17b11c8456ba
public class problem5 {

    public static void main(String[] args) {

<<<<<<< HEAD
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(
            Candidate.shortlistAndRank(candidates)
        );
    }
}
=======
        // Create two Student objects
        Student student1 = new Student("Ravi", 90);
        Student student2 = new Student("Anu", 95);

        // Call static method using class name
        Student.printCollegeInfo();
    }
}

>>>>>>> c0eef5d7687aa3bbed511b71bf9f17b11c8456ba
