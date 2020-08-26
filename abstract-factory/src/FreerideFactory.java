public class FreerideFactory implements AbstractFactory {
    @Override
    public Ski createSki() {
        return new FreerideSki();
    }

    @Override
    public Snowboard createSnowboard() {
        return new FreerideSnowboard();
    }

    @Override
    public WinterClothes createWinterClothes() {
        return new FreerideWinterClothes();
    }
}
