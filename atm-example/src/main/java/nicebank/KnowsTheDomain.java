package nicebank;

public class KnowsTheDomain {
    private Account myAccount;
    private Teller automatedTeller;
    private CashSlot cashSlot;

    public Account getMyAccount() {
        if (myAccount == null){
            myAccount = new Account();
        }

        return myAccount;
    }

    public Teller getTeller() {
        if (automatedTeller == null){
            automatedTeller = new AtmUserInterface();
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
