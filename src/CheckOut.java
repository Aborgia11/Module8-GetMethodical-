import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean hasMoreItems = true;
        while (hasMoreItems) {
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item ($0.50 - $10.00)", 0.50, 10.00);
            totalCost += price;
            hasMoreItems = SafeInput.getYNConfirm(in, "Do you have more items? (Y/N)");
        }
        System.out.printf("Total cost of the item(s): $%.2f%n", totalCost);

        in.close();
    }
}
