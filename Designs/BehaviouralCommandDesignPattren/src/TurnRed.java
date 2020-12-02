public class TurnRed implements Command {
    protected Lights lights;
    public TurnRed(Lights lights) {
        this.lights = lights;
    }
    @Override
    public void execute() {
        lights.turnRed();
    }
}
