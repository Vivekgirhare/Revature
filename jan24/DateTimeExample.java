package jan24;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeExample {
    public static void main(String[] args) {
//        LocalDate today=LocalDate.now();
//        System.out.println(today);
//        LocalDate dob=LocalDate.of(1987,4,10);
//        System.out.println(dob);
//        LocalDate nextweek=today.plusWeeks(1);
//        System.out.println(nextweek);
//        LocalTime now=LocalTime.now();
//        LocalTime meeting=LocalTime.of(11,30);
//        System.out.println(now);
//        System.out.println(meeting);
//        ZonedDateTime indianTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//        System.out.println(indianTime);
//        ZonedDateTime  usTime=indianTime.withZoneSameInstant(ZoneId.of("America/New_York"));
//        System.out.println(usTime);
//        Instant nowq = Instant.now();
//        System.out.println(nowq);
//
//        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
//        String formatted=LocalDateTime.now().format(formatter);
//        System.out.println(formatted);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        // Order date
        LocalDate orderDate = LocalDate.now();

        LocalDate deliveryDate = orderDate.plusDays(3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("You have ordered " + item + " and you will receive the item on " +
                        deliveryDate.format(formatter));

        sc.close();

    }
}