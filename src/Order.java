import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {

    private List<OrderObserver> observers = new ArrayList<>();
    private List<Item> items = new ArrayList<>();
    private double discountAmount = 0.0;
    private double shippingCost = 10.0;

    private void updateObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void attach(OrderObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void addItem(Item item) {
        items.add(item);
        updateObservers();
    }

    public void removeItem(Item item) {
        items.remove(item);
        updateObservers();
    }

    public void setDiscountAmount(double amount) {
        this.discountAmount = amount;
    }

    public void setShippingCost(double cost) {
        this.shippingCost = cost;
    }

    public double getItemsPrice() {

        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public int getItemCount() {
        return items.size();
    }

    public double getTotalPrice() {
        return getItemsPrice() - discountAmount + shippingCost;
    }

    public String toString() {

        String itemsString = items.stream().map(Item::toString).collect(Collectors.joining(", "));

        return "{ items: [" + itemsString + "]}, items price: " + getItemsPrice() + ", discount: " + this.discountAmount + ", shipping cost: " + this.shippingCost + ", total price: " + this.getTotalPrice() + " }";
    }

}
