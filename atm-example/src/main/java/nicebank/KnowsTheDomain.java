package nicebank;

public class KnowsTheDomain {
    private Account myAccount;
    private AutomatedTeller automatedTeller;
    private CashSlot cashSlot;

    public Account getMyAccount() {
        if (myAccount == null){
            myAccount = new Account();
        }

        return myAccount;
    }

    public AutomatedTeller getTeller() {
        if (automatedTeller == null){
            automatedTeller = new AutomatedTeller(getCashSlot());
        }

        return automatedTeller;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null){
            cashSlot = new CashSlot();
        }

        return cashSlot;
    }
}
