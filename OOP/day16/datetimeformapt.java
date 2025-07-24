package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformapt {
    public static void main(String[] args) {
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-mm-yyyy--E HH:MM:SS a");
        DateTimeFormatter a = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter b = DateTimeFormatter.ISO_LOCAL_TIME;
        String Mydate =t.format(f);
        System.out.println(Mydate);
    }
    
}
