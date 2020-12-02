//Adapter class
public class CpuAdapter implements Connector {
    private CPU adaptee;
    public CpuAdapter(CPU c) {
        this.adaptee = c;
    }

    @Override
    public void info() {
    adaptee.info();
    }
}
