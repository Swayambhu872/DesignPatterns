public class Main {
    public static void main(String [] args) {
        Lights lights =new Lights();
    Command command = new TurnGreen(lights);
    Invoker in = new Invoker();
    in.submit(command);
    }
}
