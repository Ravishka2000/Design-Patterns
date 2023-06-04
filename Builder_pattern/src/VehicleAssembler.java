public class VehicleAssembler {
    private VehicleBuilder vehicleBuilder;

    public VehicleAssembler(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    public void assembleVehicle() {
        vehicleBuilder.buildBrand();
        vehicleBuilder.buildColor();
        vehicleBuilder.buildModel();
    }

    public Vehicle getVehicle() {
        return vehicleBuilder.getVehicle();
    }
}
