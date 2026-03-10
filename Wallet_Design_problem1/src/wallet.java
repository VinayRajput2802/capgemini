public class wallet {
    private Integer wallet_id;
    private Integer balance;
    private String name;
    public wallet(Integer wallet_id, Integer balance, String name) {
        this.wallet_id = wallet_id;
        this.balance = balance;
        this.name = name;
    }
    void checkBalance() {
        System.out.println("Hi " + this.name + " your balance is- " + this.balance);
    }
    void addBalance(Integer amount) {
        if (amount < 0) {

        }
        this.balance += amount;
    }
}
