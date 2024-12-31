package LLD.Questions.CarRentalSystem;

import java.util.ArrayList;

public class Store {
    int storeId;
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    //CRUD for list of vehicles or can be taken out of this class.

    Location location;
    ArrayList<Reservation> reservations = new ArrayList<>();
}
