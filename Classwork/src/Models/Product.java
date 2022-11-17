package Models;

import java.text.Format;

public class Product {

    String name;
    int Product_code;
    int Price;
    String Product_brand;
    String Description;

    String format;
    public Product(String name, int product_code,String product_brand, int Price , String description) {
        this.name = name;
        Product_code = product_code;
        Product_brand = product_brand;
        this.Price = Price;
        Description = description;
    }

    public String getName() {
        return name;
    }

    public int getProduct_code() {
        return Product_code;
    }

    public String getProduct_brand() {
        return Product_brand;
    }

    public int getPrice() {
        return Price;
    }


    public String getDescription() {
        return Description;
    }


    public String getFormat() {
        System.out.println("Product_Code " + "Brand " + "Price " +"Description ");
        System.out.println(this.Product_code+"        "+ this.Product_brand+"  "+this.Price+"   "+this.Description+"");
        return format;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setProduct_code(int product_code) {
        Product_code = product_code;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public void setProduct_brand(String product_brand) {
        Product_brand = product_brand;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
