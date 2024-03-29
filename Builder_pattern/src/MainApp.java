public class MainApp {
    public static void main(String[] args){
        VehicleBuilder carBuilder = new CarBuilder();
        VehicleAssembler assembler = new VehicleAssembler(carBuilder);
        assembler.assembleVehicle();
        assembler.getVehicle();

        System.out.println("=======================================");

        VehicleBuilder busBuilder = new BusBuilder();
        VehicleAssembler assembler2 = new VehicleAssembler(busBuilder);
        assembler2.assembleVehicle();
        assembler2.getVehicle();

    }
}
