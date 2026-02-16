class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dept, double sal) {
        this.employeeID = id;
        this.department = dept;
        this.salary = sal;
    }

    public void setSalary(double sal) { salary = sal; }
    public double getSalary() { return salary; }
}

// Subclass
class Manager extends Employee {
    String teamName;

    Manager(int id, String dept, double sal, String team) {
        super(id, dept, sal);
        this.teamName = team;
    }

    void displayManager() {
        System.out.println("EmployeeID: " + employeeID + ", Department: " + department +
                           ", Salary: " + getSalary() + ", Team: " + teamName);
    }

    public static void main(String[] args) {
        Manager m = new Manager(1, "IT", 90000, "Dev Team");
        m.displayManager();
    }
}
