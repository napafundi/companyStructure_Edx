import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    public int headCount = 0;
    public int checkIns = 0;
    public ArrayList<SoftwareEngineer> reports = new ArrayList<>();
    private static double salaryMultiplier = 1.3;


    public TechnicalLead(String name) {
        super(name, salaryMultiplier);
    }

    public boolean hasHeadCount() {
        return (reports.size() < headCount);
    }

    public boolean addReport(SoftwareEngineer eng) {
        if (this.hasHeadCount()) {
            reports.add(eng);
            return true;
        }
        return false;
    }

    public boolean approveCheckIn(SoftwareEngineer eng) {
        if (eng.getManager() == this && eng.getCodeAccess() == true) {
            checkIns++;
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e, double bonus) {
        BusinessLead thisManager = ((BusinessLead) this.getManager());
        if (thisManager.requestBonus(e, bonus)) {
            this.bonus += bonus;
            return true;
        }
        return false;
    }

    public String getTeamStatus() {
        String str = super.employeeStatus() + " has " + checkIns + " check ins ";
        if (reports.size() == 0) {
            return str + " and no direct reports yet.";
        }
        str += " check ins and is managing:";
        for (SoftwareEngineer employee: reports) {
            str += "\n" + employee.employeeStatus() + " has " + employee.getSuccessfulCheckIns() + " successful check ins.";
        }
        return str;
    }
}
