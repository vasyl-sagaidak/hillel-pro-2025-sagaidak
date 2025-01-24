package examples.date_time_api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeAPI {
    public static void main(String[] args) {
//        Date date = new Date();
//        Date date2 = new Date();
//        date2.setTime(165164864); //Устанавливает время в миллисекундах относительно исходной даты 1 янв 1970.
//        System.out.println(date2);
//
//        System.out.println(date); // Возвращает текущую дату
//        System.out.println(date.toString()); // Возвращает текущую дату
//        System.out.println(date.getTime()); //Возвращает время истекшее с 1 января 1970 года в миллисекундах
//        System.out.println(date.equals(date2)); //Сравнивает две даты, возвращает булевое выражение
//        System.out.println(date.after(date2)); //Сравнивает является ли дата на которой вызов после даты переданной в параметр.
//        System.out.println(date.before(date2)); //Сравнивает явл. ли дата на которой вызов до даты переданной в параметр.

//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//
//        LocalDate localDate2 = LocalDate.of(1987, 12, 30);
//        System.out.println(localDate2);
//        System.out.println(localDate2.getYear()); // Возвращает год
//        System.out.println(localDate.plusDays(10)); //Добавляет к дате некоторое количество дней

//        LocalDate today = LocalDate.now();
//        LocalDate januaryOne2024 = LocalDate.of(2024, 1, 1);
//        System.out.println(ChronoUnit.MONTHS.between(today, januaryOne2024));
//
//        LocalTime wakeUpTime = LocalTime.parse("08:30:00");
//        LocalTime dinnerTime = LocalTime.parse("20:00:00");
//        System.out.println(ChronoUnit.HOURS.between(wakeUpTime, dinnerTime));

        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            System.out.println(Math.random() * 10);
        }
        double finish = System.currentTimeMillis() - start;
        System.out.println(finish/1000);

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String date = "31.12.1987";
        LocalDate date1 = LocalDate.parse(date, formatter);
        System.out.println(date1);
        LocalDate date2 = LocalDate.now();
        System.out.println(date2);

    }
}
