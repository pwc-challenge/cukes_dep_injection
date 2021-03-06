package nicebank;

public class Account {
    private Money balance = new Money();

    public void credit(Money amount){
        balance = balance.add(amount);
    }

    public Money getBalance() {
        return balance;
    }

    public void debit(int dollars) {
        balance = balance.minus(new Money(dollars, 0));
    }
}
