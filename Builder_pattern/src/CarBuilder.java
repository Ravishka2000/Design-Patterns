public class CarBuilder implements VehicleBuilder {
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildBrand() {
        car.setBrand("Toyota");
    }

    @Override
    public void buildColor() {
        car.setColor("Red");
    }

    @Override
    public void buildModel() {
        car.setModel("Corolla");
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}