package zadania.dom.dom;

import java.time.*;

public class LocalDate1 {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.of(2023, 11, 27);
//
//        System.out.println(localDate.getDayOfWeek());
//        System.out.println(localDate.getYear());
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate);
//
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//
//        LocalTime now1 = LocalTime.now();
//        System.out.println(now1);
//        LocalTime Mt_ = LocalTime.now(ZoneId.of("Europe/Warsaw"));
//        System.out.println(Mt_);
//
//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        for (String zoneTd : availableZoneIds) {
//            System.out.println(zoneTd);
//
//        }
        Instant czas = Instant.now();
        System.out.println(czas);
        System.out.println();

        LocalDateTime warsaww = LocalDateTime.ofInstant(czas, ZoneId.of("Europe/Warsaw"));
        LocalDateTime newYork = LocalDateTime.ofInstant(czas, ZoneId.of("America/New_York"));

        System.out.println(warsaww);
        System.out.println(newYork);

        System.out.println(czas.getEpochSecond());

        Instant instant = Instant.ofEpochSecond(1701117155);

        System.out.println(instant);


    }

}
