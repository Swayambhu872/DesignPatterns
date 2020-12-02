//proxy class
public class SecureMobile {
    protected Mobile mobile;
    public SecureMobile() {
        this.mobile =new Mobile();
    }
    public void unlock(String password) {
        if(this.authenticate(password)) {
            this.mobile.unlock();
        } else
            System.out.println("Invalid password.Please try again");

    }
    public boolean authenticate(String password) {
        return password.equals("Kazekage3");
    }
}

