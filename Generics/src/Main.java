import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;


class Student<T> {
    T value;
    public void show() {
        System.out.println(value.getClass().getName());
    }


    Student(T value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
//        String string = Generic.doSomething("Hello World!");
//        System.out.println(string);

//         Container<Integer> container = new Container<>();
//         container.value = 10;
//         container.show();


       Student<Integer> s1 = new Student<>(10);
       Student<String> s2 = new Student<>("Hello World!");

         for (Student<?> s : Arrays.asList(s1, s2)) {
             s.show();
         }

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTimeZone().toString());

        System.out.println(calendar.getTime());

        System.out.println(LocalDateTime.now(Clock.systemUTC()));

        ZoneId zoneId = ZoneId.of("America/New_York");



        System.out.println(LocalTime.now(zoneId));

        java.sql.Date date = new java.sql.Date(0);

        System.out.println(date);

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.getEra());


    }

//    public static void invokeSleep(List<? extends  Number> list) {
//        for (Number n : list) {
//            System.out.println(n);
//        }
//    }






}


