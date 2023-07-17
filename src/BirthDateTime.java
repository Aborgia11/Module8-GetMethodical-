import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for year of birth
        int year = SafeInput.getRangedInt(in, "Enter the year of your birth", 1950, 2015);

        // Prompt for month of birth
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth (1-12)", 1, 12);

        // Prompt for day of birth
        int day = 0;
        switch (month) {
            case 2: // February
                day = SafeInput.getRangedInt(in, "Enter the day of your birth (1-29)", 1, 29);
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                day = SafeInput.getRangedInt(in, "Enter the day of your birth (1-30)", 1, 30);
                break;
            default: // Other months
                day = SafeInput.getRangedInt(in, "Enter the day of your birth (1-31)", 1, 31);
        }

        // Prompt for hours of birth
        int hours = SafeInput.getRangedInt(in, "Enter the hours of your birth (1-24)", 1, 24);

        // Prompt for minutes of birth
        int minutes = SafeInput.getRangedInt(in, "Enter the minutes of your birth (1-59)", 1, 59);

        System.out.println("\nDate and Time of Birth:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);

        in.close();
    }
}