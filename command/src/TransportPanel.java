import java.util.Scanner;

public class TransportPanel {

    public Position position = new Position();
    public Direction direction = new Direction();

    public void init(){

        System.out.println("Введите М, R или exit");

        Scanner scanner = new Scanner(System.in);

        while (true){
            String currentString = scanner.nextLine();

            if(currentString.equalsIgnoreCase("exit")){
                break;
            }

            if (currentString.equalsIgnoreCase("M")){
               executeCommand(new MoveForwardCommand(this));
               continue;
            }

            if (currentString.equalsIgnoreCase("R")){
               executeCommand(new RotateCommand(this));
               continue;
            }
            System.out.println("Неверная команда. Введите М, R или exit");
        }
    }

    private void executeCommand(Command command){
        if(command.execute()){
            System.out.println("Success execute command " + command.toString());
        }
    }

}
