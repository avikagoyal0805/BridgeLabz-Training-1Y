class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access private CGPA
    public void setCGPA(double cgpa) { CGPA = cgpa; }
    public double getCGPA() { return CGPA; }
}

// Subclass to demonstrate protected access
class PostgraduateStudent extends Student {
    String researchTopic;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String topic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = topic;
    }

    void displayInfo() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() +
                           ", Topic: " + researchTopic);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 9.1, "AI Research");
        pg.displayInfo();
    }
}
