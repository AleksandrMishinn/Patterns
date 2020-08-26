public class ObserverMain {
    public static void main(String[] args) {

        SerialNotifier serialNotifier = new SerialNotifier("Игра пристолов", "OgoMK");
        serialNotifier.subscribe("Игра пристолов", new EMailSubscriber("classicMan@yandex.ru"));
        serialNotifier.subscribe("OgoMK", new EMailSubscriber("chetkiyMen@yandex.ru"));
        serialNotifier.subscribe("OgoMK", new EMailSubscriber("test@gmail.com"));

        serialNotifier.notify("OgoMK");

    }
}
