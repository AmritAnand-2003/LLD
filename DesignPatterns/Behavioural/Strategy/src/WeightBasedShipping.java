
public class WeightBasedShipping implements ShippingStrategy {
    private final double ratePerKg;

    public WeightBasedShipping(double ratePerKg) {
        this.ratePerKg = ratePerKg;
    }

    @Override
    public double calculateCost(Order order) {
        System.out.println("Calculating weight-based shipping cost: " + ratePerKg + " per kg");
        double weight = order.getTotalWeight();
        double cost = weight * ratePerKg;
        System.out.println("Total cost for weight-based shipping: " + cost);
        return cost;
    }
}
