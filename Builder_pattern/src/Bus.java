public class Bus implements Vehicle {
    private String brand;
    private String color;
    private String model;

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bus [brand=" + brand + ", color=" + color + ", model=" + model + "]";
    }
}