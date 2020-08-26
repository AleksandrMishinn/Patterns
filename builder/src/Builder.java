public interface Builder {
    void createPlaneBody(PlanBody planBody);
    void setEngine(Engine engine);
    void setSeats(Seats seats);
    void installElectronicSystem(Electronic electronic);
    Plane getResult();
}
