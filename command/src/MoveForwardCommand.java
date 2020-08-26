public class MoveForwardCommand extends Command{

    MoveForwardCommand(TransportPanel transportPanel) {
        super(transportPanel);
    }

    @Override
    public boolean execute() {
        transportPanel.position.setPosition(transportPanel.position.getPosition()+1);
        return true;
    }

    @Override
    public String toString() {
        return "MoveForwardCommand{}";
    }
}
