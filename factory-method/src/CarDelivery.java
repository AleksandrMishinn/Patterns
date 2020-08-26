public class CarDelivery implements FoodDelivery{
    @Override
    public void deliver() {
        System.out.println("A car with food is driving toward you!");
    }
}
