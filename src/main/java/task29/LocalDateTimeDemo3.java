package task29;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo3 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime date1 = now.with(ChronoField.HOUR_OF_DAY, 10);
        LocalDateTime date2 = now.withMonth(8);
        LocalDateTime date3 = now.withYear(2013).withMinute(0);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        // Сравнение
        boolean after = now.isAfter(date1);
        boolean before = now.isBefore(date1);
        boolean equal = now.equals(date1);
        System.out.println(after);
        System.out.println(before);
        System.out.println(equal);

        // Добавление
        LocalDateTime date4 = now.plusYears(4);
        LocalDateTime date5 = now.plusWeeks(3);
        LocalDateTime date6 = date1.plus(2, ChronoUnit.HOURS);
        System.out.println(date4);
        System.out.println(date5);
        System.out.println(date6);

        // Вычитание
        LocalDateTime date7 = now.minusMonths(2);
        LocalDateTime date8 = now.minusNanos(1);
        LocalDateTime date9 = now.minus(10, ChronoUnit.SECONDS);
        System.out.println(date7);
        System.out.println(date8);
        System.out.println(date9);
    }
}
