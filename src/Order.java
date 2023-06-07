import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderObserver> observers = new ArrayList<>();
    private List<Item> items = new ArrayList<>();
    private double discountAmount = 0.0;
    private double shippingCost = 10.0;

    private void updateObservers() {

    }

    public void attach(OrderObserver observer) {

    }

    public void detach(OrderObserver observer) {

    }

    public void addItem(Item item) {

    }

    public void removeItem(Item item) {

    }

    public void setDiscountAmount(double amount) {

    }

    public void setShippingCost(double cost) {

    }

    public double getItemsPrice() {
        return 0;
    }

    public int getItemCount() {
        return 0;
    }

    public double getTotalPrice() {
        return 0;
    }

    public String toString() {
        return "";
    }

}
