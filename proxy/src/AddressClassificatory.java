public class AddressClassificatory implements AddressOuterLibrary{

    @Override
    public Address getAddress() {
        System.out.println("Getting address...");
        return new Address();
    }
}
