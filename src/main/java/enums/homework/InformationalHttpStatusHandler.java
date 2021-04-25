package enums.homework;

public class InformationalHttpStatusHandler implements StatusHandler {

    @Override
    public void handler() {
        System.out.println("Handler Information .......................");
    }
}
