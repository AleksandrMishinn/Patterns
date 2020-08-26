public class ProxyMain {
    public static void main(String[] args) {
        AddressOuterLibrary classificatory = new AddressClassificatoryProxy();
        Address address = classificatory.getAddress();
    }

}
