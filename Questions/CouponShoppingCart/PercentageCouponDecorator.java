package LLD.Questions.CouponShoppingCart;

public class PercentageCouponDecorator extends CouponDecorator{
    Product product;
    int dicountPercentage;

    PercentageCouponDecorator(Product iProduct, int iDiscountPercentage){
        this.product = iProduct;
        this.dicountPercentage = iDiscountPercentage;
    }

    @Override
    public double getPrice(){
        double price = product.getPrice();
        return price*((double)(100-this.dicountPercentage)/100);
    }
    
}
