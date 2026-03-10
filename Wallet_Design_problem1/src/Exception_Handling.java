public class Exception_Handling {
    public static void check_balance(Integer amount, Integer balance) throws Invalid_Balance,Insufficient_Balance {
        if (amount < 0) {
            throw new Invalid_Balance();
        }
        if (balance < 0) {
            throw new Insufficient_Balance();
        }
    }
}


class Invalid_Balance extends Exception {
    public Invalid_Balance() {
        super("Invalid balance");
    }
}
class Insufficient_Balance extends Exception {
    public Insufficient_Balance() {
        super("Insufficient balance");
    }
}