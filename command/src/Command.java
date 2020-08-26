public abstract class Command {

    public TransportPanel transportPanel;
    private int backupPosition;
    private int backupDirection;

    Command(TransportPanel transportPanel) {
        this.transportPanel = transportPanel;
    }

    void backup() {
        backupPosition = transportPanel.position.getPosition();
        backupDirection = transportPanel.direction.getDirection();
    }

    public void undo() {
        transportPanel.position.setPosition(backupPosition);
        transportPanel.direction.setDirection(backupDirection);
    }

    public abstract boolean execute();
}
