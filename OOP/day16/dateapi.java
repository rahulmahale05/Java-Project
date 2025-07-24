package day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dateapi {
    public static void main(String[] args) {
    LocalDate a = LocalDate.now();
    System.out.println(a);
    LocalTime b = LocalTime.now();
    System.out.println(b);

    LocalDateTime c = LocalDateTime.now();
    System.out.println(c);
    }
    
}
