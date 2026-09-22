<<<<<<< HEAD
import java.util.Arrays;

public class problem3 {

    static int[] findTopThreeScores(int[] scores) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int score : scores) {

            if (score >= first) {
                third = second;
                second = first;
                first = score;
            } 
            else if (score >= second) {
                third = second;
                second = score;
            } 
            else if (score >= third) {
                third = score;
            }
        }

        return new int[]{first, second, third};
    }

    public static void main(String[] args) {

        int[] scores = {45, 82, 79, 90, 33, 90, 61};

        int[] result = findTopThreeScores(scores);

        System.out.println(Arrays.toString(result));
    }
}
=======
class Course {

    String code;
    String title;
    int credits;
    int labCredits;

    // Four-argument constructor
    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    // Three-argument constructor
    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    // Calculate total credits
    public int totalCredits() {
        return credits + labCredits;
    }
}


public class problem3 {

    public static void main(String[] args) {

        // Theory-only course
        Course course1 = new Course(
            "21CSC201J",
            "Data Structures",
            4
        );

        // Course with lab
        Course course2 = new Course(
            "21CSC205L",
            "DSA Lab",
            3,
            1
        );

        // Print total credits
        System.out.println(
            course1.code + " total credits: " + course1.totalCredits()
        );

        System.out.println(
            course2.code + " total credits: " + course2.totalCredits()
        );
    }
}

>>>>>>> c0eef5d7687aa3bbed511b71bf9f17b11c8456ba
