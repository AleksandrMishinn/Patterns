public class LocationDecorator extends BasicDecorator{

    public LocationDecorator(PhotoPoster photoPoster) {
        super(photoPoster);
    }

    @Override
    public void postPhoto() {
        addLocation();
        super.postPhoto();
    }

    private void addLocation(){
        System.out.println("Location added");
    }
}
