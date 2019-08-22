import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee {
    private static double salaryMultiplier = 2;
    private int headCount;
    private ArrayList<Accountant> reports = new ArrayList<>();

    public BusinessLead(String name) {
        super(name, salaryMultiplier);
        this.headCount = 10;
    }

    public boolean hasHeadCount() {
        return (reports.size() < headCount);
    }

    public boolean addReport(Accountant acc, TechnicalLead supportTeam) {
        if (this.hasHeadCount()) {
            reports.add(acc);
            this.bonusBudget += acc.getBaseSalary() * 1.1;
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (this.bonusBudget > bonus) {
            this.bonusBudget -= bonus;
            e.bonus += bonus;
            return true;
        }
        return false;
    }

    public boolean approveBonus(Employee e, double bonus) {
        for (Accountant acc: reports) {
            if (e.getManager() == acc.getTeamSupported() && acc.approveBonus(bonus)) {
                e.bonus += bonus;
                acc.bonusBudget -= bonus;
                return true;
            }
        }
        return false;
    }

    public String getTeamStatus() {
        String str = super.employeeStatus() + " has " + reports.size() + " reports ";
        str += " and is managing:";
        for (Accountant employee: reports) {
            str += "\n" + employee.employeeStatus();
        }
        return str;
    }
}
