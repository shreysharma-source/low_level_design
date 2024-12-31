package LLD.Questions.CouponShoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> productList; // = new ArrayList<Product>();

    public ShoppingCart(){
        productList = new ArrayList<>();
    }

    public void addToCart(Product iProduct){
        Product productAfterDiscount = new ProductTypeCouponDecorator(
            new PercentageCouponDecorator(iProduct, 10),
            3,
            iProduct.getProductType()
        );
        productList.add(productAfterDiscount);
    }

    public double getTotalPrice(){
        double price = 0;
        for (Product product: productList){
            price += product.getPrice();
        }

        return price;
    }


}
