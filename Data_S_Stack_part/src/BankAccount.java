import java.util.Stack;

class BankAccount {
    private double balance;
    private Stack<Double> history = new Stack<>();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        history.push(amount);
        System.out.println("Deposit " + amount + " -> balance " + balance);
    }

    public void undoLastDeposit() {
        if (history.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }
        double last = history.pop();
        balance = balance - last;
        System.out.println("Undo " + last + " -> balance " + balance);
    }
}
