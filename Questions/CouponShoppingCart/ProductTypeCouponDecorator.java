package LLD.Questions.CouponShoppingCart;

import java.util.ArrayList;

public class ProductTypeCouponDecorator extends CouponDecorator{
    Product product;
    int discountPercentage;
    ProductType productType;

    static ArrayList<ProductType> eligibilityList = new ArrayList<>();

    static{
        eligibilityList.add(ProductType.FURNITURE);
        eligibilityList.add(ProductType.DECOR);
    }

    ProductTypeCouponDecorator(Product iProduct, int iDiscountPercentage, ProductType iProductType){
        this.product = iProduct;
        this.discountPercentage = iDiscountPercentage;
        this.productType = iProductType;
    }

    @Override
    public double getPrice(){
        double price = product.getPrice();
        if(eligibilityList.contains(productType)){
            return price * ((double)(100 - this.discountPercentage ) / 100);
        }

        return price;
    }

}
