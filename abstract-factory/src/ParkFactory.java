public class ParkFactory implements AbstractFactory{
    @Override
    public Ski createSki() {
        return new ParkSki();
    }

    @Override
    public Snowboard createSnowboard() {
        return new ParkSnowboard();
    }

    @Override
    public WinterClothes createWinterClothes() {
        return new ParkWinterClothes();
    }
}
