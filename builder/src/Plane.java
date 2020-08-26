public class Plane {

    private final PlanBody planBody;
    private final Engine engine;
    private final Seats seats;
    private  final Electronic electronic;

    public Plane(PlanBody planBody, Engine engine, Seats seats, Electronic electronic) {
        this.planBody = planBody;
        this.engine = engine;
        this.seats = seats;
        this.electronic = electronic;
    }

    public PlanBody getPlanBody() {
        return planBody;
    }

    public Engine getEngine() {
        return engine;
    }

    public Seats getSeats() {
        return seats;
    }

    public Electronic getElectronic() {
        return electronic;
    }
}
