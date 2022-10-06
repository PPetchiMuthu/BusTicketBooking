package BusTicketReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BookingInfo {
    public String customerName;
    public int busNo;
    public Date date;
    BookingInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Passenger name : ");
        customerName = scan.nextLine();
        System.out.print("Bus No : ");
        busNo = scan.nextInt();
        System.out.print("Date DD-MM-YYYY : ");
        String dateInString = scan.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
