package Parking_Lot.Model;

import java.util.*;
public class Ticket {
    private Date date;
private String vehicleName;
private VehicleSize vehicleSize;
private int slotNumber;
public Ticket(int slotNumber,String vehicleName,VehicleSize vehicleSize,Date date){
   super();
    this.slotNumber=slotNumber;
    this.vehicleName=vehicleName;
    this.vehicleSize=vehicleSize;
    this.date=date;
}
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getSlotNumber() {
        return slotNumber;
    }
    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }
    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }
    public void setVehicleSize(VehicleSize vehicleSize) {
        this.vehicleSize = vehicleSize;
    }
    public String toString(){
        return "Ticket [slotNumber=" + slotNumber + ", vehicleNumber=" + vehicleName + ", date=" + date
                + ", vehicleSize=" + vehicleSize + "]";
    }
}
