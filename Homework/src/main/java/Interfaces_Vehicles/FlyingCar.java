package Interfaces_Vehicles;

public class FlyingCar implements AirVehicle, LandVehicle, Vehicle {

    private Boolean isFlying;
    private Boolean isDriving;
    private String workingMode;
    private double speed;
    private double fuelLevel;
    private Boolean enginIsRunning;

    public FlyingCar() { //by default the Flying car is stationary so it get default values
        this.isDriving = false;
        this.isFlying = false;
        this.workingMode = "Driving Mode";
        this.speed = 0.0;
        this.fuelLevel = 0.0;
        this.enginIsRunning = false;
    }

    public void switchToDriveMode(){
//        Main.lineFill();
        if(isFlying){
            System.out.println("You must first land the Vehicle!");
        }else if(workingMode.equals("Driving Mode")){
            System.out.println("Vehicle is already in Driving mode!");
        }else {
            System.out.println("Driving Mode is now active");
            this.workingMode = "Driving Mode";
        }
//        Main.lineFill();
    }

    public void switchToFlyingMode(){
//        Main.lineFill();
        if(isDriving){
            System.out.println("You must first stop the Vehicle!");
        }else if(workingMode.equals("Flying Mode")){
            System.out.println("Vehicle is already in Flying mode!");
        }else  {
            System.out.println("Flying Mode is now active");
            this.workingMode = "Flying Mode";
        }
//        Main.lineFill();
    }

    @Override
    public void takeoff() {
//        Main.lineFill();
        if(workingMode.equals("Driving Mode")){
            System.out.println(this.getClass().getSimpleName() + " can not fly while in driving mode");
        }else if (isFlying){
            System.out.println(this.getClass().getSimpleName() + " is already flying");
        }else {
            System.out.println(this.getClass().getSimpleName() + " is has taken off");
            isFlying = true;
        }
//        Main.lineFill();
    }

    @Override
    public void land() {
//        Main.lineFill();
        if(workingMode.equals("Driving Mode")){
            System.out.println(this.getClass().getSimpleName() + " is not flying its in driving mode");
        }else if (isFlying) {
            System.out.println(this.getClass().getSimpleName() + " is landing");
            isFlying = false;
        } else {
            System.out.println(this.getClass().getSimpleName() + " is already landed");
        }
//        Main.lineFill();
    }

    @Override
    public void driveForward(double speed) {
        this.speed = speed;
//        Main.lineFill();
        if(workingMode.equals("Flying Mode")) {
            System.out.println(this.getClass().getSimpleName() + " can't drive forward while in flying mode");
        }else if (isDriving){
            System.out.println(this.getClass().getSimpleName() + " is already driving " + getSpeed() + "km/h");
        }else{
            System.out.println(this.getClass().getSimpleName() + " has started driving forward "  + getSpeed() + "km/h");
            isDriving = true;
        }
//        Main.lineFill();
    }


    @Override
    public void applyBreaks() {
//        Main.lineFill();
        if(workingMode.equals("Flying Mode")){
            System.out.println(this.getClass().getSimpleName() + " can't break while in flying mode");
        }else if (isDriving){
            System.out.println(this.getClass().getSimpleName() + " is applying breaks");
            this.speed = 0.0;
            isDriving = false;
        }else  {
            System.out.println(this.getClass().getSimpleName() + " is not driving");
        }
//        Main.lineFill();
    }

    public void getInfo(){
//        Main.lineFill();
        if(workingMode.equals("Driving Mode")) {
            if (isDriving) {
                System.out.println(this.getClass().getSimpleName() + " is driving");
            } else {
                System.out.println(this.getClass().getSimpleName() + " is parked in drive mode");
            }
        }
        else{
            if(isFlying) {
                System.out.println(this.getClass().getSimpleName() + " is flying");
            } else{
                System.out.println(this.getClass().getSimpleName() + " is parked in flying mode");
            }
        }
//        Main.lineFill();
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
        return speed;
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}