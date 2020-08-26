import java.util.Scanner;

public class AbstractFactoryMain {

    private static Application config() {

        Application app;
        AbstractFactory factory;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your style: freeride / park");
        String style = scanner.nextLine();

        if (style.equalsIgnoreCase("park")) {
            factory = new ParkFactory();
        } else {
            factory = new FreerideFactory();
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = config();
        app.create();
    }
}
