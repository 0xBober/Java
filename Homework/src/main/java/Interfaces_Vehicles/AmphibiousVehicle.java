package Interfaces_Vehicles;

public class AmphibiousVehicle implements WaterVehicle, LandVehicle, Vehicle {

    private String workingMode;
    private Boolean isCruiseing;
    private Boolean isDriving;
    private Boolean anchorDown;
    private Boolean enginIsRunning;
    private double speed;
    private double heading;
    private double fuelLevel;

    public AmphibiousVehicle() {
        this.workingMode = "Land Mode";
        this.isCruiseing = false;
        this.isDriving = false;
        this.anchorDown = false;
        this.enginIsRunning = false;
        this.speed = 0.0;
        this.fuelLevel = 0.0;
        this.heading = 0.0;
    }

    public void switchToWaterMode(){
        this.workingMode = "Water Mode";
    }

    public void switchToLandMode(){
        this.workingMode = "Land Mode";
    }

    @Override
    public void driveForward(double speed) {
        this.isDriving = true;
        this.speed = speed;
    }

    @Override
    public void applyBreaks() {
        this.isDriving = false;
        this.speed = 0;
    }

    @Override
    public void navigateOnWater(double headingDeg, double speed) {
        if(!anchorDown){
            this.heading = headingDeg;
            this.speed = speed;
            this.isCruiseing = true;
        }else{
            System.out.println("Anchor down, must pick it up at first!");
        }
    }

    @Override
    public void anchor() {
        this.isCruiseing = false;
        this.speed = 0;
        this.heading = 0;
        this.anchorDown = true;
    }

    @Override
    public void removeAnchor() {
        this.anchorDown = false;
    }

    @Override
    public void getInfo() {

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
        return this.fuelLevel;
    }
}
