package Parking_Lot.Service;

import Parking_Lot.Exception.ParkingFullException;
import Parking_Lot.Model.Ticket;
import Parking_Lot.Model.Vehicle;

public interface Parking {
    public Ticket park(Vehicle vehicle) throws ParkingFullException;
}
