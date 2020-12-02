public class TurnYellow implements Command{
    protected Lights lights;
    public TurnYellow(Lights lights) {
        this.lights = lights;
    }
    @Override
    public void execute() {
        lights.turnYellow();
    }
}
