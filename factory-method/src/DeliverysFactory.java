public abstract class DeliverysFactory {

    public void makeDelivery() {
        FoodDelivery foodDelivery = createFoodDelivery();
        foodDelivery.deliver();
    }

    public abstract FoodDelivery createFoodDelivery();

}
