public class SocialNetworkPoster implements PhotoPoster{

    protected Photo photo;

    public SocialNetworkPoster(Photo photo) {
        this.photo = photo;
    }

    @Override
    public void postPhoto() {
        executePhotoPost(photo);
    }

    private void executePhotoPost(Photo photo){
        System.out.println("photo posted");
    }
}
