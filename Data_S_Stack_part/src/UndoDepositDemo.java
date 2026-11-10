public class UndoDepositDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);
        acc.deposit(50);
        acc.deposit(20);
        acc.deposit(30);
        acc.undoLastDeposit();
        acc.undoLastDeposit();
    }
}
