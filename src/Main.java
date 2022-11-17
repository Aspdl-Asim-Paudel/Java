import Models.Order;
import Models.Product;
import Models.Users;

public class Main {
    public static void main(String[] args) {
        Users user1= new Users("Asim","9876543210",001);
        Product  Shirt_1 = new Product("Light_Shirt",10001,"Levis",200,"Best");
        Order Order_1 = new Order(10001,001,200,1,100);
        System.out.println(Shirt_1.getFormat());
        System.out.println(Order_1.getOrder_Format());

    }
}