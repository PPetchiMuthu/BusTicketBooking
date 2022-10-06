package BusTicketReservation;

public class Bus {
    private final int busNum;
    private final boolean ac;
    private int seatAvailable;

    private final String busRoute;

    public int getBusNum() {
        return busNum;
    }

    public int getSeatAvailable() {
        return seatAvailable;
    }
    public void setSeatAvailable(int seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    Bus(int busNum, boolean ac, int seatAvailable,String busRoute) {
        this.busNum = busNum;
        this.ac = ac;
        this.seatAvailable = seatAvailable;
        this.busRoute = busRoute;
    }

    public void displayBusInfo() {
        System.out.println("Bus No :" + busNum + "  AC : " + ac + "  Available seats : " + seatAvailable+" Route : "+busRoute+"\n");
    }
}
