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


public class problem5 {

    public static void main(String[] args) {

        // Create two Student objects
        Student student1 = new Student("Ravi", 90);
        Student student2 = new Student("Anu", 95);

        // Call static method using class name
        Student.printCollegeInfo();
    }
}

