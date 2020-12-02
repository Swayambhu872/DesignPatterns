public class Log {
    private static  Log obj;
    private Log(){};
    public static Log getInstance() {
        if(obj == null) {
            obj = new Log();
        }
        return obj;
    }
    public void print() {
        System.out.println("instance can be created only once");
    }
}
