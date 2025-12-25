package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food product : products) {
            if (product instanceof Discountable) {
                Discountable discountable = (Discountable) product;
                double discount = discountable.getDiscount();
                double priceWithDiscount = product.getTotalPrice() * (1 - discount / 100);
                total += priceWithDiscount;
            } else {
                total += product.getTotalPrice();
            }
        }
        return total;
    }

    public double getVegetarianTotalPrice() {
        double total = 0;
        for (Food product : products) {
            if (product.isVegetarian()) {
                total += product.getTotalPrice();
            }
        }
        return total;
    }
}

