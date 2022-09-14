package controller;

import model.Booking;
import model.SeatCount;

public class Test {

    public static void main(String[] args) {

        SeatCount account = new SeatCount();
        Booking booking = new Booking(account);
        Thread user1 = new Thread(booking);
        Thread user2 = new Thread(booking);
        Thread user3 = new Thread(booking);
        Thread user4 = new Thread(booking);
        Thread user5 = new Thread(booking);
        Thread user6 = new Thread(booking);

        user1.setName("user1");
        user2.setName("user2");
        user3.setName("user3");
        user4.setName("user4");
        user5.setName("user5");
        user6.setName("user6");

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
        user6.start();

    }

}
