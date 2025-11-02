package Interfaces_Vehicles;

public class Airplane implements Vehicle, AirVehicle {

    private Boolean isFlying;
    private Boolean enginIsRunning;
    private double speed;
    private double fuel;

    public Airplane(){
        this.isFlying = false;
        this.enginIsRunning = false;
        this.speed = 0;
        this.fuel = 0;
    }

    @Override
    public void takeoff() {
        this.isFlying = true;
    }

    @Override
    public void land() {
        this.isFlying = false;
    }

    @Override
    public void getInfo() {
        if (this.isFlying) {
            System.out.println(this.getClass().getSimpleName() + " is flying at " + getSpeed() + " km/h");
        }else{
            System.out.println(this.getClass().getSimpleName() + " is not flying");
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
        return 0;
    }
}
