public class RotateCommand extends Command{

    RotateCommand(TransportPanel transportPanel) {
        super(transportPanel);
    }

    @Override
    public boolean execute() {
        transportPanel.direction.setDirection(transportPanel.direction.getDirection() + 1);
        return true;
    }

    @Override
    public String toString() {
        return "RotateCommand{}";
    }
}
