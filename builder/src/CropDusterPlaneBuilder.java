public class CropDusterPlaneBuilder implements Builder{

    private PlanBody planBody;
    private Engine engine;
    private Seats seats;
    private Electronic electronic;

    @Override
    public void createPlaneBody(PlanBody planBody) {
        this.planBody = planBody;
        System.out.println("Создан корпус кукурузника.");
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Установлены 2 мотора, которые еще походят.");
    }

    @Override
    public void setSeats(Seats seats) {
        this.seats = seats;
        System.out.println("Установлено кресло пилота.");
    }

    @Override
    public void installElectronicSystem(Electronic electronic) {
        this.electronic = electronic;
        System.out.println("Установлена необходимая для сельского промысла электроника. Установлен радиоприемник :)");
    }

    public Plane getResult(){
        return new Plane(planBody, engine, seats, electronic);
    }
}
