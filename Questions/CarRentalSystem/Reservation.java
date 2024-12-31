package LLD.Questions.CarRentalSystem;

import java.sql.Date;

public class Reservation {
    int reservationId;
    Vehicle vehicle;
    User user;
    Date bookingDate;
    Location pickupLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;

}
