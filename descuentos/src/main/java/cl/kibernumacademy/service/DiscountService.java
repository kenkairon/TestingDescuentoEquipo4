package cl.kibernumacademy.service;

public class DiscountService {
    public double applyDiscount(double amount) {
        if (amount > 100_000) {
            return amount * 0.85;
        } else if (amount >= 50_000) {
            return amount * 0.90;
        } else {
            return amount;
        }
    }
}
