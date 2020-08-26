public class PassengerPlaneBuilder implements Builder{

    private PlanBody planBody;
    private Engine engine;
    private Seats seats;
    private Electronic electronic;

    @Override
    public void createPlaneBody(PlanBody planBody) {
        this.planBody = planBody;
        System.out.println("Создан корпус пассажирского самолета.");
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Установлены 4 мощнейшие турбины.");
    }

    @Override
    public void setSeats(Seats seats) {
        this.seats = seats;
        System.out.println("Установлено 200 поссажирских кресел.");
    }

    @Override
    public void installElectronicSystem(Electronic electronic) {
        this.electronic = electronic;
        System.out.println("Установлена необходимая для пассажирского самолета электроника. В кресла установлены мониторы :)");
    }

    public Plane getResult(){
        return new Plane(planBody, engine, seats, electronic);
    }
}
