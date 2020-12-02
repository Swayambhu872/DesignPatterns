public class Message extends Observer {
    public Message(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    public void update() {
        System.out.println("New message arrived");
    }
}
