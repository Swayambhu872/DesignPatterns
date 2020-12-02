// Adapter class
public class MobileAdapter implements Connector{
    private Mobile adaptee;
    public MobileAdapter(Mobile m) {
        this.adaptee = m;
    }
    @Override
    public void info() {
        adaptee.info();
    }
}
