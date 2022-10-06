package BusTicketReservation;
import java.util.ArrayList;
import java.util.Scanner;

public class MainBus {
    ArrayList<Bus> buses = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public MainBus() {
        buses.add(new Bus(1, true, 1, "Chennai to Bangalore"));
        buses.add(new Bus(2, false, 5, "Bangalore to Chennai"));
        buses.add(new Bus(3, true, 3, "Thoothukudi to Coimbatore"));
        buses.add(new Bus(4, true, 1, "Coimbatore to Bangalore"));
        buses.add(new Bus(5, false, 5, "Thoothukudi to Chennai"));
        buses.add(new Bus(6, true, 3, "Chennai to Coimbatore"));
    }

    private void letStart(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("                BUS TICKET RESERVATION                ");
        int userOption = 1;
        while (userOption == 1 || userOption == 2) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("For Bus Ticket Booking Press '1' \nFor Ticket Cancelling Press '2' \nFor exit Press '3' ");
            System.out.println("---------------------------------------------------------------");
            userOption = scan.nextInt();
            if (userOption == 1) {
                System.out.println("Available Buses : \n");
                for (Bus bus : buses)
                    bus.displayBusInfo();
                System.out.println("---------------------------------------------------------------");
                BookingInfo bookingObject = new BookingInfo();
                for (Bus bus : buses) {
                    if (bus.getBusNum() == bookingObject.busNo) {
                        if (bus.getSeatAvailable() != 0) {
                            bus.setSeatAvailable(bus.getSeatAvailable() - 1);
                            System.out.println("\nBooking successfully");
                            System.out.println("\nEnjoy your journey ");
                        } else System.err.println("\nSeats are not available Try another bus");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        MainBus mainBus = new MainBus();
        mainBus.letStart();
    }
}
