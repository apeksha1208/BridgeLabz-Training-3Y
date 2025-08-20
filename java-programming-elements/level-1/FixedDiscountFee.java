public class FixedDiscountFee {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + String.format("%.2f", discount) + " and final discounted fee is INR " + String.format("%.2f", finalFee));
    }
}


