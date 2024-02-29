package Parking_Lot;

import Parking_Lot.Exception.ParkingFullException;
import Parking_Lot.Model.Ticket;
import Parking_Lot.Model.Vehicle;
import Parking_Lot.Model.VehicleSize;
import Parking_Lot.Service.ParkingLot;

public class TestingPark {
    public static void main(String[] args) throws ParkingFullException {
        ParkingLot parkingLot=ParkingLot.getParkingLot();
        parkingLot.initializeParkingSlots(10,10);
        Vehicle vehicle=new Vehicle("MH12", VehicleSize.TWOWHEELER);
        Ticket tikcet=parkingLot.park(vehicle);
        System.out.println(tikcet);

        Vehicle vehicle2=new Vehicle("MH13",VehicleSize.FOURWHEELER);
      Ticket ticket2=parkingLot.park(vehicle2);
        System.out.println(ticket2);
//        Vehicle vehicle3=new Vehicle("MH14",VehicleSize.FOURWHEELER);
//        Ticket ticket3=parkingLot.park(vehicle3);
//      System.out.println(ticket3);
    }
}
