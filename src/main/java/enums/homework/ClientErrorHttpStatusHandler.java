package enums.homework;

import java.util.ArrayList;
import java.util.List;

public class ClientErrorHttpStatusHandler implements StatusHandler {
   private List<String> listClient = new ArrayList<>();
    {
        listClient.add("400 Bad Request");
        listClient.add("01 Unauthorized");
        listClient.add("02 Payment Required");
        listClient.add("03 Forbidden");
        listClient.add("04 Not Found");
        listClient.add("405 Method Not Allowed");
        listClient.add("06 Not Acceptable");
        listClient.add("407 Proxy Authentication Required");
        listClient.add("408 Request Timeout");
        listClient.add("09 Conflict");
        listClient.add("410 Gone");
        listClient.add("411 Length Required");
        listClient.add("12 Precondition Failed");
        listClient.add("413 Payload Too Large");
        listClient.add("414 Request-URI Too Long");
        listClient.add("415 Unsupported Media Type");
        listClient.add("416 Requested Range Not Satisfiable");
        listClient.add("417 Expectation Failed");
        listClient.add(" 418 I'm a teapot");
        listClient.add("421 Misdirected ");
        listClient.add("22 Unprocessable Entity");
        listClient.add("423 Locked");
        listClient.add("424 Failed Dependency");
        listClient.add("426 Upgrade Required");
        listClient.add("428 Precondition Required");
        listClient.add("29 Too Many Requests");
        listClient.add("31 Request Header Fields Too Large");
        listClient.add("44 Connection Closed Without Response");
        listClient.add("51 Unavailable For Legal Reasons");
        listClient.add("99 Client Closed Request");
    }

    @Override
    public void handler() {
        listClient.forEach(System.out::println);
    }
}
