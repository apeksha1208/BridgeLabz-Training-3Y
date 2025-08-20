import java.util.Scanner;

public class DiscountFeeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fee (INR): ");
        double fee = input.nextDouble();
        System.out.print("Enter discount percent: ");
        double discountPercent = input.nextDouble();
        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + String.format("%.2f", discount) + " and final discounted fee is INR " + String.format("%.2f", finalFee));
        input.close();
    }
}


