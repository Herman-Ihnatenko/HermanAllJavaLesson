package HomeWork45;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Task 2
Написать метод, принимающий список из нескольких дат типа LocalDate и
возвращающий количество дней между самой ранней и поздней датами в этом списке
 */
public class DateArray {
    public static void main(String[] args) {
        long days = getDaysBetween(new LocalDate[]{LocalDate.of(2010, 6, 22), LocalDate.of(2010, 5, 22)});
        System.out.println("days between: " + days);
    }
    public static long getDaysBetween(LocalDate[] dates) {
        LocalDate minDate = dates[0];
        LocalDate maxDate = dates[0];
        for (LocalDate date : dates)
            if (date.isBefore(minDate)) {
                minDate = date;
            } else if (date.isAfter(maxDate)) {
                maxDate = date;
            }
        return ChronoUnit.DAYS.between(minDate, maxDate);
    }
}
