public class DecoratorMain {
    public static void main(String[] args) {
        Photo photo = new Photo();
        new LocationDecorator(
                new FilterDecorator(
                        new SocialNetworkPoster(photo))).postPhoto();

    }
}
