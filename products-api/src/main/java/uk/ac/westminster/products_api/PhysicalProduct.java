package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it has an id, name and price like every product, and only adds shipping details.
// A ShoppingCart would NOT pass the IS-A test because a cart contains products rather than being one.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {

        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + " kg";
    }

}
