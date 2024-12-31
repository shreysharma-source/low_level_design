package LLD.Questions.CouponShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product product1 = new Product("FAN", 1700, ProductType.ELECTRONICS);
        Product product2 = new Product("SOFA", 17000, ProductType.FURNITURE);

        cart.addToCart(product1);
        cart.addToCart(product2);

        System.out.println("Total discounted price " + cart.getTotalPrice());
    }
}
