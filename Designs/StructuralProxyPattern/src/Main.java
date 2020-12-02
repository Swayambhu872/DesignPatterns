import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the password to unlock your phone");
        String password = scan.nextLine();
        SecureMobile sc = new SecureMobile();
        sc.unlock(password);
    }
}

