public class EMailSubscriber implements Subscriber{

    public String EMail;

    public EMailSubscriber(String EMail) {
        this.EMail = EMail;
    }

    @Override
    public void send(String serial) {
        System.out.println("По электронной почте отправлено уведомление о выходе новой серии сериала " + serial + ". Получатель: " + EMail);
    }
}
