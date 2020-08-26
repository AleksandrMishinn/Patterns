public class Engine {

    private final int power;
    private final int quantity;

    public Engine(int power, int quantity) {
        this.power = power;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.valueOf(power);
    }
}
