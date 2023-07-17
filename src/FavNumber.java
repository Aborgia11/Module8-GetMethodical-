import java.util.Scanner;

public class FavNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for favorite integer
        int favoriteInt = SafeInput.getInt(in, "Enter your favorite integer");
        System.out.println("Your favorite integer is: " + favoriteInt);

        // Prompt for favorite double
        double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("Your favorite double is: " + favoriteDouble);

        in.close();
    }
}
