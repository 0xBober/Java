package Interfaces_Vehicles;

public class Ship implements Vehicle, WaterVehicle {

    private Boolean enginIsRunning;
    private Boolean isCruiseing;
    private Boolean anchorDown;
    private double heading;
    private double speed;
    private double fuel;

    public Ship() {
        this.enginIsRunning = false;
        this.isCruiseing = false;
        this.anchorDown = true;
        this.heading = 0;
        this.speed = 0;
        this.fuel = 0;
    }


    @Override
    public void getInfo() {
        if(this.isCruiseing) {
            System.out.println("Cruise is running");
        }else{
            System.out.println("Cruise is not running");
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
        return this.fuel;
    }

    @Override
    public void navigateOnWater(double headingDeg, double speed) {
        this.isCruiseing = true;
        this.speed = speed;
        this.heading = headingDeg;
    }

    @Override
    public void anchor() {
        this.anchorDown = true;
    }

    @Override
    public void removeAnchor() {
        this.anchorDown = false;
    }
}
