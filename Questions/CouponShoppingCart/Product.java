package LLD.Questions.CouponShoppingCart;

public class Product {
    String name;
    double originalPrice;

    ProductType productType;

    Product(){}

    Product(String iName, double iOriginalPrice, ProductType iProductType){
        this.name = iName;
        this.originalPrice = iOriginalPrice;
        this.productType = iProductType;
    }

    public double getPrice(){
        return this.originalPrice;
    }

    public ProductType getProductType(){
        return this.productType;
    }
}
