public class BuilderMain {
    public static void main(String[] args) {

        Director director = new Director();

        Builder builder = new PassengerPlaneBuilder();
        director.constructPassengerPlane(builder);
        Plane passengerPlane = builder.getResult();

        System.out.println("Мощность двигателя в самолете: " + passengerPlane.getEngine().toString());
        System.out.println();

        Builder countrysideBuilder = new CropDusterPlaneBuilder();
        director.constructDusterPlane(countrysideBuilder);
        Plane countrysidePlane = countrysideBuilder.getResult();

        System.out.println("Мощность двигателя в самолете: " + countrysidePlane.getEngine().toString());

    }
}
