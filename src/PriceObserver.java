public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getItemsPrice() > 200) {
            order.setDiscountAmount(20);
        } else {
            order.setDiscountAmount(0);
        }
    }
}
