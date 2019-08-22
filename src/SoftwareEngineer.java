public class SoftwareEngineer extends TechnicalEmployee {
    private boolean codeAccess = false;
    private int checkIns = 0;

    public SoftwareEngineer(String name) {
        super(name);
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean access) {
        this.codeAccess = access;
    }

    public int getSuccessfulCheckIns() {
        return checkIns;
    }

    public boolean checkInCode() {
        TechnicalLead thisManager = ((TechnicalLead) this.getManager());
        if (thisManager.approveCheckIn(this)) {
            checkIns++;
            return true;
        }
        return false;
    }
}
