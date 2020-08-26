public class AddressClassificatoryProxy implements AddressOuterLibrary{

    private AddressClassificatory addressClassificatory;

    public AddressClassificatoryProxy(AddressClassificatory addressClassificatory) {
        this.addressClassificatory = addressClassificatory;
    }

    public AddressClassificatoryProxy() {
        this(new AddressClassificatory());
    }

    @Override
    public Address getAddress() {
        System.out.println("Making some additional logic...");
        return addressClassificatory.getAddress();
    }
}
