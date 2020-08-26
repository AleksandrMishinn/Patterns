public class WalkingDeliveryFactory extends DeliverysFactory {
    @Override
    public FoodDelivery createFoodDelivery() {
        return new WalkingDeliver();
    }
}
