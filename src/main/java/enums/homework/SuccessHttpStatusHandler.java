package enums.homework;

public class SuccessHttpStatusHandler implements StatusHandler {
    @Override
    public void handler() {
        System.out.println("Handler Success .......................");
    }
}
