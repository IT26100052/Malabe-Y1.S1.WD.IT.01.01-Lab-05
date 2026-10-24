import java.util.Scanner;

public class IT26100052Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // CONSTANTS
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_3_DAYS = 10.0;
        final double DISCOUNT_5_DAYS = 20.0;
        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();
        
        // Validation 1 - Dates must be between 1 and 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }
        
        // Validation 2 - Start should be less than End
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }
        
        int noOfDays = endDate - startDate;
        double totalAmount;
        double discount = 0;
        
        if (noOfDays < 3) {
            discount = 0;
        } else if (noOfDays <= 4) { // 3-4 days
            discount = DISCOUNT_3_DAYS;
        } else { // 5 or more
            discount = DISCOUNT_5_DAYS;
        }
        
        totalAmount = (noOfDays * ROOM_CHARGE) * (100 - discount) / 100;
        
        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + noOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);
        
        input.close();
    }
}