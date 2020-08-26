public class BasicDecorator implements PhotoPoster{

    private PhotoPoster wrapper;

    public BasicDecorator(PhotoPoster wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void postPhoto() {
        wrapper.postPhoto();
    }
}
