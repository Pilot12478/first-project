package practiceProgrammingPrinciples;

public class DiscountCalculator {

    //Исходный код:
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.0;

        if (isLoyalCustomer) {
            if (isFirstPurchase) {
                discount = price * 0.10;
            } else {
                discount = price * 0.05;
            }
        } else {
            if (hasCoupon) {
                discount = price * 0.07;
            } else {
                discount = price * 0.02;
            }
        }
        return price - discount;
    }

    final static double DISCOUNT_FOR_FIRST_PURCHASE_FOR_LOYAL_CUSTOMERS = 0.10;
    final static double BASE_DISCOUNT_FOR_LOYAL_CUSTOMERS = 0.05;
    final static double DISCOUNT_FOR_COUPON = 0.07;
    final static double BASE_DISCOUNT = 0.02;

    // с применением KISS
    public static double calculateDiscount2(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.0;
        if (isLoyalCustomer) {
            discount = isFirstPurchase ? price * DISCOUNT_FOR_FIRST_PURCHASE_FOR_LOYAL_CUSTOMERS : price * BASE_DISCOUNT_FOR_LOYAL_CUSTOMERS;
        } else {
            discount = hasCoupon ? price * DISCOUNT_FOR_COUPON : price * BASE_DISCOUNT;
        }
        return price - discount;
    }

    static void main() {
        System.out.println(calculateDiscount2(120,true,true,true));
        //результат 108.0 применилась скидка 10% для лояльных клиентов, покупка первая
        System.out.println(calculateDiscount2(120,false,true,true));
        //результат 111.6 применилась скидка 7% по купону
        System.out.println(calculateDiscount2(120,false,false,false));
        //результат 117.6 применилась скидка 2% базовая
        System.out.println(calculateDiscount2(120,true,false,true));
        //результат 114.0 применилась скидка 5% для лояльных клиентов, но покупка не первая
    }

}
