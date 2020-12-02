public class TurnGreen implements Command{
    protected Lights lights;
    public TurnGreen(Lights lights) {
        this.lights = lights;
    }
    @Override
    public void execute() {
        lights.turnGreen();
    }
}
