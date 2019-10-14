package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    public double getPrice(int quantity, int itemPrice) {
        double discount = getDiscount(quantity, itemPrice);
        double shippingCost = Math.min(quantity * itemPrice * 0.1, 100.0);

        return quantity * itemPrice - discount + shippingCost;
    }

    private double getDiscount(int quantity, int itemPrice) {
        if (quantity - 500 > 0) {
            return (quantity - 500) * itemPrice * 0.05;
        } else {
            return 0;
        }
    }

}
