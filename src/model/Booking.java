package model;

public class Booking implements Runnable {

    private SeatCount count;

    public Booking(SeatCount count) {
        this.count = count;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 45; i++) {

            book(1);

            if (count.getCount() < 0) {
                System.out.println("All Seat Booked");
            }

        }

    }

    private synchronized void book(int amount) {

        if (count.getCount() >= amount) {

            System.out.println(Thread.currentThread().getName() + " Booking " + amount);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

            count.setBalance(count.getCount() - amount);
            System.out.println(Thread.currentThread().getName() + " Booked " + amount + " , Remaining Seat " + count.getCount());

        }

        if (count.getCount() < amount) {

            System.out.println(Thread.currentThread().getName() + " No Enought Seat. Your available Seat Count is " + count.getCount());
        }

    }

}
