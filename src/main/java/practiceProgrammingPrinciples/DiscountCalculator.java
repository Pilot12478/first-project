package practiceProgrammingPrinciples;

public class DiscountCalculator {


    final static double DISCOUNT_FOR_FIRST_PURCHASE_FOR_LOYAL_CUSTOMERS = 0.10;
    final static double BASE_DISCOUNT_FOR_LOYAL_CUSTOMERS = 0.05;
    final static double DISCOUNT_FOR_COUPON = 0.07;
    final static double BASE_DISCOUNT = 0.02;

    // с применением KISS
    public static double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discountRate = 0.0;
        if (isLoyalCustomer && isFirstPurchase) {
            discountRate = DISCOUNT_FOR_FIRST_PURCHASE_FOR_LOYAL_CUSTOMERS;
        }
        if (isLoyalCustomer && !isFirstPurchase) {
            discountRate = BASE_DISCOUNT_FOR_LOYAL_CUSTOMERS;
        }
        if (!isLoyalCustomer && hasCoupon) {
            discountRate = DISCOUNT_FOR_COUPON;
        }
        if (!isLoyalCustomer && !hasCoupon) {
            discountRate = BASE_DISCOUNT;
        }
        return price - price * discountRate;
    }

    static void main() {
        System.out.println(calculateDiscount(120, true, true, true));
        //результат 108.0 применилась скидка 10% для лояльных клиентов, покупка первая
        System.out.println(calculateDiscount(120, false, true, true));
        //результат 111.6 применилась скидка 7% по купону
        System.out.println(calculateDiscount(120, false, false, false));
        //результат 117.6 применилась скидка 2% базовая
        System.out.println(calculateDiscount(120, true, false, true));
        //результат 114.0 применилась скидка 5% для лояльных клиентов, но покупка не первая
    }

}
