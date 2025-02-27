package Constructors.Instances.OnlineCourseManagment;

class Course {
    // Instance variables
    private String courseName;
    private int duration; // in weeks
    private double fee;

    // Class variable (common for all instances)
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("----------------------");
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 10, 5000);
        Course course2 = new Course("Data Science", 12, 8000);

        // Displaying details before updating institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Updating the institute name
        Course.updateInstituteName("Tech Academy");

        // Displaying details after updating institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}

