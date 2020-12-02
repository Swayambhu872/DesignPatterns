public class PhoneCall extends Observer{
    public PhoneCall(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    public void update() {
        System.out.println("New missed call");
    }
}
