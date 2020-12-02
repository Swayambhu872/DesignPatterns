// AdapterPattern
public class Main {
    public static void main(String [] args) {
        Connector [] list = {new CpuAdapter(new CPU()), new MobileAdapter(new Mobile())};
        for (Connector connector : list) {
            connector.info();
        }
    }
}
