package date_time;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        String date1 = "1983-08-08";
        String date2 = "2021-04-08";
        String data3 = "2021-25-04";

        System.out.println(returnDifferenceBetweenDates(date1, date2));
        System.out.println(returnDataFormatString(data3));
    }

    //todo write a method which take 2 params Dates(yyyy-mm-dd) in string format and return difference in days between
    @SneakyThrows
    public static long returnDifferenceBetweenDates(String date1, String date2) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        final LocalDate parseDate1 = LocalDate.parse(date1, formatter);
        final LocalDate parseDate2 = LocalDate.parse(date2, formatter);
        return ChronoUnit.YEARS.between(parseDate1, parseDate2);
    }

    //todo write a method which takes a sting in format yyyy-dd-mm and return string in format yy-mm-dd
    @SneakyThrows
    public static String returnDataFormatString(String date1) {
        SimpleDateFormat fromFormat = new SimpleDateFormat("yyyy-dd-MM");
        SimpleDateFormat toFormat = new SimpleDateFormat("yy-MM-dd");
        return toFormat.format(fromFormat.parse(date1));
    }
}
