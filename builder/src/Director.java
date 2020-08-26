public class Director {

    public void constructPassengerPlane(Builder builder){
        builder.createPlaneBody(new PlanBody());
        builder.setEngine(new Engine(2000, 4));
        builder.setSeats(new Seats(200));
        builder.installElectronicSystem(new Electronic(ElectronicType.XZIBIT));
    }

    public void constructDusterPlane(Builder builder){
        builder.createPlaneBody(new PlanBody());
        builder.setEngine(new Engine(100, 2));
        builder.setSeats(new Seats(1));
        builder.installElectronicSystem(new Electronic(ElectronicType.COUNTRYSIDE));
    }
}
