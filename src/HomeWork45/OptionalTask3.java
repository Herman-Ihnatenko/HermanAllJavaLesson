package HomeWork45;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
15-12-2022 20-46
Запарсить строку в формат LocalDateTime.
Распечатать отдельно месяц, день, час объекта LDT

13-01-2023 00-47
Какому дню недели соответствует вторая дата
Сколько дней между этими двумя датами
 */
public class OptionalTask3 {
    public static void main(String[] args) {
        String str = "15-12-2022 20-46";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime ldt = LocalDateTime.parse(str, formatter);

        System.out.println("Month: " + ldt.getMonth());
        System.out.println("Day: " + ldt.getDayOfMonth());
        System.out.println("Hour: " + ldt.getHour());

        System.out.println("\n==========================");

        String str1 = "13-01-2023 00-47";
        LocalDateTime ldt1 = LocalDateTime.parse(str1, formatter);
        System.out.println("Day of the week: " + ldt1.getDayOfWeek());

        long days = ChronoUnit.DAYS.between(ldt.toLocalDate(), ldt1.toLocalDate());
        System.out.println("Days between: " + days);
    }
}
