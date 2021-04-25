package enums.homework;

import lombok.Getter;

@Getter
public enum ListOfHttpStatus {

    INFORMATIONAL(100, 199, new InformationalHttpStatusHandler()),
    SUCCESS(200, 299, new SuccessHttpStatusHandler()),
    REDIRECTION(300, 399, new RedirectionHttpStatusHandler()),
    CLIENT_ERROR(400, 499, new ClientErrorHttpStatusHandler()),
    SERVER_ERROR(500, 599, new ServerErrorHttpStatusHandler());

    private final int rangeMin;
    private final int rangeMax;
    private StatusHandler statusHandler;

    ListOfHttpStatus(int rangeMin, int rangeMax, StatusHandler statusHandler) {
        this.rangeMin = rangeMin;
        this.rangeMax = rangeMax;
        this.statusHandler = statusHandler;
    }

    public static ListOfHttpStatus checkingCodeHttpStatus(int code) {
        ListOfHttpStatus[] list = values();
        for (ListOfHttpStatus httpStatus : list) {
            if (code > httpStatus.rangeMin && code < httpStatus.rangeMax) {
                return httpStatus;
            }
        }
        throw new RuntimeException("Incorrect HttpStatus");
    }
}
