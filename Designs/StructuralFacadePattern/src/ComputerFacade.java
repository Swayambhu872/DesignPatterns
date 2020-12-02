// Facade class
public class ComputerFacade {
    protected Computer computer;
     public ComputerFacade() {
         this.computer =new Computer();
     }
     public void turnOff() {
         computer.saveState();
         computer.terminateThreads();
         computer.logOutUser();
     }
}
