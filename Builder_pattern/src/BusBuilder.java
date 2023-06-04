public class BusBuilder implements VehicleBuilder {
    private Bus bus;

    public BusBuilder() {
        this.bus = new Bus();
    }

    @Override
    public void buildBrand() {
        bus.setBrand("Volvo");
    }

    @Override
    public void buildColor() {
        bus.setColor("Blue");
    }

    @Override
    public void buildModel() {
        bus.setModel("XC90");
    }

    @Override
    public Vehicle getVehicle() {
        return bus;
    }
}