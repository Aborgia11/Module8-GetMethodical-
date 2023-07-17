import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test SSN pattern
        String ssn = SafeInput.getRegExString(in, "Enter your Social Security Number (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);

        // Test UC Student M number pattern
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (M######)", "^(M|m)\\d{5}$");
        System.out.println("M Number: " + mNumber);

        // Test menu choice pattern
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Menu Choice: " + menuChoice);

        in.close();
    }
}
