package Interfaces_Vehicles;

public class Bus implements Vehicle, LandVehicle {

    public Boolean enginIsRunning = false;
    public Boolean isDriving = false;
    public double fuelLevel = 0.0;
    public double speed = 0.0;

    public Bus(){
        this.enginIsRunning = false;
        this.isDriving = false;
        this.fuelLevel = 0.0;
        this.speed = 0.0;
    }

    @Override
    public void driveForward(double speed) {
        this.speed = speed;
        this.isDriving = true;
    }

    @Override
    public void applyBreaks() {
        this.speed = 0.0;
        this.isDriving = false;
    }

    @Override
    public void getInfo() {
        if(this.isDriving){
            System.out.println(this.getClass().getSimpleName() + ": is Driving at "  + getSpeed() + " km/h");
        }
        else{
            System.out.println(this.getClass().getSimpleName() + ": is parked");
        }
    }

    @Override
    public void start() {
        this.enginIsRunning = true;
    }

    @Override
    public void stop() {
        this.enginIsRunning = false;
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}
