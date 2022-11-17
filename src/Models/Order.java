package Models;

public class Order {


    int Product_code;
    int User_id;
    int Price;
    int Quantity;

    int Discount;
    String Order_Format;

    public Order(int product_code, int user_id, int price, int quantity, int discount) {
        Product_code = product_code;
        User_id = user_id;
        Price = price;
        Quantity = quantity;
        Discount = discount;
    }

    public int getProduct_code() {
        return Product_code;
    }

    public void setProduct_code(int product_code) {
        Product_code = product_code;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int user_id) {
        User_id = user_id;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getTotal() {
        int Total = (int) (this.Price*this.Quantity);

        return Total;

    }

    public int getDiscount() {
        return Discount;
    }

    public int getFTotal() {
        int FTotal = (int) (this.getTotal()-this.getDiscount());

        return FTotal;

    }


    public String getOrder_Format() {

        System.out.println("The product was ordered by user no :"+this.User_id+"\n The ordered product is product no:"+ this.Product_code+"\n The Price is   "+ this.Price+"\n The quantity is   "+this.Quantity+"\n The Total = "+this.getTotal()+"\n The discount is "+this.getDiscount()+"\n The final total = "+ this.getFTotal());
        return Order_Format;
    }

    public void setOrder_Format(String order_Format) {
        Order_Format = order_Format;
    }
}
