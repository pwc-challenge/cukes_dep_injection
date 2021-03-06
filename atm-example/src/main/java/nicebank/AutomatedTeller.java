package nicebank;

public class AutomatedTeller implements Teller{
    private CashSlot cashSlot;

    public AutomatedTeller(CashSlot cashSlot){
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, int dollars){
        account.debit(dollars);
        this.cashSlot.dispense(dollars);
    }
}
