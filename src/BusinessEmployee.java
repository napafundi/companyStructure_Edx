public class BusinessEmployee extends Employee {
    public double bonusBudget = 0;
    public  double budget = 0;
    private static double baseSalary = 50000;


    public BusinessEmployee(String name) {
        super(name, baseSalary);
    }

    public BusinessEmployee(String name, double salaryMultiplier) {
        super(name, baseSalary * salaryMultiplier);
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    @Override
    public String employeeStatus() {
        return super.employeeStatus() + " with a budget of " + this.budget;
    }
}
