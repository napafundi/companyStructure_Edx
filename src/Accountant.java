public class Accountant extends BusinessEmployee {

    private double bonusBudget;
    private TechnicalLead teamSupported;

    public Accountant(String name) {
        super(name);
        this.bonusBudget = 0;
    }

    public TechnicalLead getTeamSupported() {
        return teamSupported;
    }

    public void supportTeam(TechnicalLead lead) {
        teamSupported = lead;
        int teamSize = lead.reports.size();
        bonusBudget = (teamSize * 75000) * 1.1;
    }

    public boolean approveBonus(double bonus) {
        if (teamSupported == null) {
            return false;
        }
        if (bonus < bonusBudget) {
            return true;
        }
        return false;
    }

    @Override
    public String employeeStatus() {
        String support = "";
        if (teamSupported == null) {
            support = "no one";
        } else {
            support = teamSupported.getName();
        }
        return super.employeeStatus() + " is supporting " + support;
    }
}
