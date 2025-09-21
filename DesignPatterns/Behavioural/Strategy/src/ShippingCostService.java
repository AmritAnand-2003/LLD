public class ShippingCostService {
    private ShippingCostStrategy strategy;

    public ShippingCostService(ShippingCostStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ShippingCostStrategy strategy) {
        System.out.println("Setting new shipping strategy: " + strategy.getClass().getSimpleName());
        this.strategy = strategy;
    }

    public double calculateShippingCost(Order order) {
        if(strategy == null) {
            throw new IllegalStateException("Shipping strategy is not set.");
        }
        double cost = strategy.calculateCost(order);
        System.out.println("Calculated shipping cost: " + cost);
        return cost;
    }
}
