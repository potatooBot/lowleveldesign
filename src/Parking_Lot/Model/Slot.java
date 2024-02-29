package Parking_Lot.Model;

public class Slot {
    private int number;
    private boolean isEmpty=true;
    private Vehicle parkVehicle;


    public Slot(int number) {
        this.number = number;
    }

    public Vehicle getParkVehicle() {
        return parkVehicle;
    }
    public void setSlotNumber(int number){
        this.number=number;
    }
    public int getSlotNumber()
    {
        return number;
    }
    public boolean getEmpty(){
        return isEmpty;
    }
    public void setEmpty(boolean isEmpty){
        this.isEmpty=isEmpty;
    }
    public void setParkVehicle(Vehicle parkVehicle) {
        this.parkVehicle = parkVehicle;
    }

    public void occupy(Vehicle parkVehicle){
        this.parkVehicle=parkVehicle;
       this.isEmpty=false;
    }
    public void vacate(Vehicle parkVehicle){
       this.parkVehicle=null;
       this.isEmpty=true;
    }

    public boolean isEmpty(){
        return isEmpty;
    }

}

