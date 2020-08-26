import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SerialNotifier {

    Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public SerialNotifier(String... serials) {
        for (String serial : serials){
            this.subscribers.put(serial, new ArrayList<>());
        }
    }

    public void subscribe(String serial, Subscriber subscriber){
        List<Subscriber> users = subscribers.get(serial);
        users.add(subscriber);
    }

    public void unsubscribe(String serial, Subscriber subscriber){
        List<Subscriber> users = subscribers.get(serial);
        users.remove(subscriber);
    }

    public void notify(String serial){
        List<Subscriber> users = subscribers.get(serial);
        for (Subscriber subscriber : users){
            subscriber.send(serial);
        }

    }
}
