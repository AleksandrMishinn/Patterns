public class FactoryMain {

    private static DeliverysFactory deliverysFactory;

    public static void main(String[] args) {
        choseDeliveryType(Math.random());
        maleDelivery();
    }

    private static void choseDeliveryType(double someParameter) {
        deliverysFactory = someParameter < 0.5 ? new WalkingDeliveryFactory() : new CarDeliveryFactory();
    }

    private static void maleDelivery(){
        FoodDelivery foodDelivery = deliverysFactory.createFoodDelivery();
        foodDelivery.deliver();
    }

}
