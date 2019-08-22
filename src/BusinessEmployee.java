public class BusinessEmployee extends Employee {
    private static double baseSalary = 50000;
    private static double bonusBudget = 0;
    public static double budget = 0;

    public BusinessEmployee(String name) {
        super(name, baseSalary);
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    @Override
    public String employeeStatus() {
        return super.employeeStatus() + " with a budget of " + this.budget;
    }
}
