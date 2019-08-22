public abstract class Employee {
    private String name;
    private double baseSalary;
    private int employeeID;
    private Employee manager;

    private static int ID = 0;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        ID++;
        this.employeeID = ID;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Employee getManager() {
        return manager;
    }

    public boolean equals(Employee other) {
        if (this.employeeID == other.employeeID) {
            return true;
        }
        return false;
    }

    public String toString() {
        return employeeID + " " + name;
    }

    public String employeeStatus() {
        return this.toString();
    }
}
