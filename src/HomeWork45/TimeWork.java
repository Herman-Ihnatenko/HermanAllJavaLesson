package HomeWork45;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Task 1
Получить и вывести на экран:
    -текущую дату
    -текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
    -текущее время
    -текущее время + 3 часа
Создать дату:
    -которая на неделю позже сегодняшней
    -которая была на год раньше сегодняшней используя метод minus
    -которая на год позже сегодняшней
    -tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */
public class TimeWork {
    public static void main(String[] args) {
        LocalDate rightDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Текущая дата: " + rightDate.format(formatter));
        System.out.println("Текущий год: " + rightDate.getYear());
        System.out.println("Текущий месяц: " + rightDate.getMonth());
        System.out.println("Текущий день: " + rightDate.getDayOfMonth());

        System.out.println("\n==========================");

        LocalDate date = LocalDate.of(2010, 6, 22);
        System.out.println(date.getDayOfMonth() + "." + date.getMonth() + "." + date.getYear());

        System.out.println("\n==========================");
        LocalDate date1 = LocalDate.of(2010, 6, 22);
        LocalDate date2 = LocalDate.of(2010, 5, 22);
        System.out.println(date1.equals(date2));

        System.out.println("\n==========================");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Текущее время: " + localDateTime);
        System.out.println("Текущее время + 3 часа: " + localDateTime.plusHours(3));

        System.out.println("\n==========================");

        LocalDate date3 = LocalDate.now().plusWeeks(1);
        LocalDate date4 = LocalDate.now().minusYears(1);
        LocalDate date5 = LocalDate.now().plusYears(1);
        System.out.println("Дата на неделю позже сегодняшней: " + date3);
        System.out.println("Дата на год раньше сегодняшней: " + date4);
        System.out.println("Дата на год позже сегодняшней: " + date5);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println(rightDate.isBefore(tomorrow));
        System.out.println(rightDate.isAfter(yesterday));
    }
}
