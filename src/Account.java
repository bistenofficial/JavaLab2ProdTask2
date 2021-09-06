public class Account {
    private String Name_contribution;
    private int Balance;
    private String Name_Bank;
    private User user;

    public Account(String NameC, int balance, String NameB, User US) {
        this.Name_contribution = NameC;
        this.Balance = balance;
        this.Name_Bank = NameB;
        this.user = US;
    }

    public int getBalance() {
        return this.Balance;
    }

    public String getName_Bank() {
        return Name_Bank;
    }

    public void setBalance(int balance) {
        this.Balance = balance;
    }
}