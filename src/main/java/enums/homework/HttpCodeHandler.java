package enums.homework;

public class HttpCodeHandler {

    public void handleHttpCode(int httpCode) {
        //todo refactor and finish this method without using even one if statement
      ListOfHttpStatus.checkingCodeHttpStatus(httpCode).getStatusHandler().handler();
    }
}
