public class FilterDecorator extends BasicDecorator{

    public FilterDecorator(SocialNetworkPoster wrapper) {
        super(wrapper);
    }

    @Override
    public void postPhoto() {
        addGraphicsFilters();
        super.postPhoto();
    }

    private void addGraphicsFilters(){
        System.out.println("graphic filters covered");
    }
}
