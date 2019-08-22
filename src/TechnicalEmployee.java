public class TechnicalEmployee extends Employee{
    private static double baseSalary = 75000;

    public TechnicalEmployee(String name) {
        super(name, baseSalary);
    }

    public String employeeStatus() {
        return super.employeeStatus();
    }

}
