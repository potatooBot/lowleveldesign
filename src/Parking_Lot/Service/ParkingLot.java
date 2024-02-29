package Parking_Lot.Service;

import Parking_Lot.Exception.ParkingFullException;
import Parking_Lot.Model.Slot;
import Parking_Lot.Model.Ticket;
import Parking_Lot.Model.Vehicle;
import Parking_Lot.Model.VehicleSize;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingLot implements Parking{
    private static ParkingLot parkingLot;
    private final List<Slot> twowheeler;
    private final List<Slot> fourwheeler;
    public ParkingLot(){
        twowheeler=new ArrayList<>();
        fourwheeler=new ArrayList<>();
    }

    public static ParkingLot getParkingLot() {
        if(parkingLot==null){
            return new ParkingLot();
        }
        return parkingLot;
    }
    public void clearAll(){
        parkingLot=null;
    }
    public boolean initializeParkingSlots(int numberoftwowheelerslots,int numberoffourwheelerslots){
        for (int i = 1; i <=numberoftwowheelerslots ; i++) {
            twowheeler.add(new Slot(i));
        }
        System.out.println("Created Two Wheeler Parking with "+numberoftwowheelerslots+" of slots");
        for (int i = 1; i <=numberoffourwheelerslots ; i++) {
            fourwheeler.add(new Slot(i));
        }

        System.out.println("Created Four Wheeler Parking with "+numberoffourwheelerslots+" of slots");
    return true;
    }
    public Slot getNextFourAvailableSlot() throws ParkingFullException{
        for (Slot slot : fourwheeler) {
            if(slot.isEmpty()) {
                return slot;
            }
        }

     throw new ParkingFullException("No New Slot Available");
    }

    public Slot getNextTwoAvailableSlot() throws ParkingFullException {
        for (Slot slot : twowheeler) {
            if (slot.isEmpty()) {
                return slot;
            }
        }

       throw new ParkingFullException("No New Slot Available");
    }


    public Ticket park(Vehicle vehicle) throws ParkingFullException{
        Slot nextAvailableslot;
        if(vehicle.getVehicleSize().equals(VehicleSize.FOURWHEELER)){
nextAvailableslot=getNextFourAvailableSlot();
        }
        else {
            nextAvailableslot=getNextTwoAvailableSlot();
        }
        nextAvailableslot.occupy(vehicle);
        System.out.printf("Allocated slot number: ",+nextAvailableslot.getSlotNumber());
        Ticket ticket = new Ticket(nextAvailableslot.getSlotNumber(), vehicle.getVehicleNumber(),vehicle.getVehicleSize(), new Date());
        return ticket;
}
}
