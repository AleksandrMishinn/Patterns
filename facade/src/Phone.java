public class Phone {
    public void makeCall(int number){

        MobileNetwork mobileNetwork = new MobileNetwork();

        BaseStation baseStation = mobileNetwork.getNearBase();

        Commutator commutator = baseStation.getCommutator();
        commutator.commutate(number);

        PhoneConnection phoneConnection = commutator.getPhoneConnection();

        if (phoneConnection != null){
            System.out.println("Связь установлена. *Гудки*");
        }

    }
}
