class Course {
    String courseName;  // Instance variable
    int duration;       // in weeks
    double fee;         // Instance variable
    static String instituteName = "ABC Institute"; // Class variable

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration +
                           " weeks, Fee: " + fee + ", Institute: " + instituteName);
    }

    // Class method
    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 15000);
        Course c2 = new Course("Python Programming", 6, 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
