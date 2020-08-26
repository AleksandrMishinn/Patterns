public class Application {

    private Ski ski;
    private Snowboard snowboard;
    private WinterClothes winterClothes;

    public Application(AbstractFactory factory) {
        ski = factory.createSki();
        snowboard = factory.createSnowboard();
        winterClothes = factory.createWinterClothes();
    }

    public void create(){
        ski.create();
        snowboard.create();
        winterClothes.create();
    }
}
