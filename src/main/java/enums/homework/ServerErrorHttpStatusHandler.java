package enums.homework;

public class ServerErrorHttpStatusHandler implements StatusHandler {
    @Override
    public void handler() {
        System.out.println("Handler Server .......................");
    }
}
