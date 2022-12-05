package it.develhope.datetime;


import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test{
    public static void main(String[] args) {

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMMM-yy-HH-mm")));
        ZonedDateTime c = ZonedDateTime.now(Clock.systemDefaultZone());
        System.out.println(c);
    }
}
