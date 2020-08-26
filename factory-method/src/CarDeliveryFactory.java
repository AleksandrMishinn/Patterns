public class CarDeliveryFactory extends DeliverysFactory{
    @Override
    public FoodDelivery createFoodDelivery() {
        return new CarDelivery();
    }
}
