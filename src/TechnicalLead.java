import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    public int headCount = 0;
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

    }
}
