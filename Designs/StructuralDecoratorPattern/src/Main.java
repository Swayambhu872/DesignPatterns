public class Main {
    public static void main(String [] args) {
        Image i = new BasicImage();
        i = new BlackAndWhiteFilter(i);
        i.getDescription();
    }
}
