package projectoop;

import java.util.ArrayList;
import java.util.List;


public class OrderDetail {
    private int Id;
    private int orderId;
    private int productId;
    private float price;
    private int quantity;
    
    private List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();


    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
     
    
}
