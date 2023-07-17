import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString method
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Your name is: " + name);

        // Test getInt method
        int number = SafeInput.getInt(in, "Enter any integer");
        System.out.println("The entered number is: " + number);

        // Test getDouble method
        double value = SafeInput.getDouble(in, "Enter any double value");
        System.out.println("The entered value is: " + value);

        // Test getRangedInt method
        int age = SafeInput.getRangedInt(in, "Enter your age", 18, 99);
        System.out.println("Your age is: " + age);


        // Test getRangedDouble method
        double salary = SafeInput.getRangedDouble(in, "Enter your salary", 0.0, 100000.0);
        System.out.println("Your salary is: " + salary);

// Test getYNConfirm method
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to proceed?");
        System.out.println("User confirmation: " + (confirm ? "Yes" : "No"));

        // Test getRegExString method
        String email = SafeInput.getRegExString(in, "Enter your email", "\\w+@\\w+\\.\\w+");
        System.out.println("Your email is: " + email);

        in.close();


    }

}
