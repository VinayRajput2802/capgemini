import java.util.Scanner;

// Custom Exception
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class third {

    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Invalid Password");
        }

        boolean hasDigit = false;
        boolean hasUppercase = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
        }

        if (!hasDigit || !hasUppercase) {
            throw new InvalidPasswordException("Invalid Password");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        try {
            validatePassword(password);
            System.out.println("Valid Password");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}
