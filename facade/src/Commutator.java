public class Commutator {

    private PhoneConnection phoneConnection;

    public void commutate(int number){
        this.phoneConnection = new PhoneConnection();
    }

    public PhoneConnection getPhoneConnection(){
        return phoneConnection;
    }
}
