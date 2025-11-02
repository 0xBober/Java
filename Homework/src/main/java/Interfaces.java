import Interfaces_Notifications.EmailNotification;
import Interfaces_Notifications.PushNotification;
import Interfaces_Notifications.SmsNotification;

import Interfaces_Animals.Cat;
import Interfaces_Animals.Dog;
import Interfaces_Animals.Fish;
import Interfaces_Vehicles.*;

public class Interfaces {
    public void task_1() {
        System.out.println("""
                🔹 Task 1 – Interface and Implementations
                Create an interface called Notification that declares the following method:
                void send();
                
                Then, create example classes such as:
                ●EmailNotification
                ●SMSNotification
                ●PushNotification
                
                Each class should:
                ●Implement the Notification interface.
                ●Contain private fields: recipient and message.
                ●Implement the send() method according to how that message would be sent.
                
                For example:
                In EmailNotification, the send() method should display in the console:
                Sent email to <recipient>: <message>
                """);

        Boolean NotificationBool = true;

        while(NotificationBool){
            System.out.println("""
                    What kind of message would you like to send:
                    1. Push Notification
                    2. Email
                    3. SMS
                    0. Close Messaging platform""");
            int MessageChoice = Main.input.nextInt();

            if(MessageChoice == 0){
                System.out.println("Messaging platform closed");
                break;
            }

            Main.input.nextLine();

            System.out.println("To who would you like to send a message?");
            String recipient = Main.input.nextLine();

            System.out.println("Please enter the message to send:");
            String message = Main.input.nextLine();

            switch (MessageChoice) {
                case 1:
                    PushNotification PushNotification = new PushNotification(recipient, message);
                    PushNotification.send();
                    break;
                case 2:
                    EmailNotification EmailNotification = new EmailNotification(recipient, message);
                    EmailNotification.send();
                    break;
                case 3:
                    SmsNotification SmsNotification = new SmsNotification(recipient, message);
                    SmsNotification.send();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    public void task_2() {
        System.out.println("""
                🔹 Task 2 – Using Interfaces with Inheritance
                
                Take Task 1 from the Inheritance section and modify it to use interfaces.
                Create several classes that represent animals, and in each class, implement the required methods appropriately for that specific animal.
                """);

        Cat Mimi = new Cat("Mimi", 4);
        Mimi.introduceYourself();
        Mimi.eat();
        Mimi.voice();

        Dog Delta = new Dog("Delta", 1);
        Delta.introduceYourself();
        Delta.eat();
        Delta.voice();

        Fish Steven = new Fish("Steven", 14);
        Steven.introduceYourself();
        Steven.eat();
        Steven.voice();
    }
    public void task_3() {
        System.out.println("""
                🔹 Task 3 – Vehicle System
                
                Design a system describing vehicles that can perform different functions.
                Create the following interfaces:
                
                LandVehicle:
                ●void driveForward(double speed);
                ●void applyBrakes();
                
                WaterVehicle:
                ●void navigateOnWater(double headingDeg, double speed);
                ●void anchor();
                ●void removeAnchor();
                
                AirVehicle:
                ●void takeOff();
                ●void land();
                
                Now, create the following classes:
                
                ●AmphibiousVehicle
                ●FlyingCar
                
                Each should implement the appropriate interfaces.
                """);

        System.out.println("""
                Please select a vehicle:
                1. AmphibiousVehicle //not implemented yet
                2. FlyingCar""");

        int VehicleChoice = Main.input.nextInt();

//        FlyingCar vehicle = switch (VehicleChoice) {
//            case 1 -> new FlyingCar();//AmphibiousVehicle();
//            case 2 -> new FlyingCar();
//            default -> {
//                System.out.println("Invalid choice. Defaulting to FlyingCar.");
//                yield new FlyingCar();
//            }
//        };

        FlyingCar vehicle = new FlyingCar();

        boolean simBool = true;
        int vehicleAction;

        while(simBool) {
            System.out.println("""
                    What actions would you like to take:
                    1. get Info
                    2. switch to DriveMode/LandMode
                    3. switch to FlyMode/WaterMode
                    4. drive Forward
                    5. apply the Breaks
                    6. take off
                    7. land
                    0. turn off sim""");
            vehicleAction = Main.input.nextInt();
            switch (vehicleAction) {
                case 1 -> vehicle.getInfo();
                case 2 -> vehicle.switchToDriveMode();
                case 3 -> vehicle.switchToFlyingMode();
                case 4 -> vehicle.driveForward(60);
                case 5 -> vehicle.applyBreaks();
                case 6 -> vehicle.takeoff();
                case 7 -> vehicle.land();
                case 0 -> {
                    simBool = false;
                    System.out.println("Turning off sim");
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
    public void task_4() {
        System.out.println("""
                🔹 Task 4 – Expanding the Vehicle System
                
                Based on the previous task, add the following additional interfaces:
                
                Vehicle:
                ●void start();
                ●void stop();
                ●double getSpeed();
                ●double getFuelLevel();
                
                AmphibiousVehicle and FlyingVehicle
                ●These interfaces should include the methods that were previously defined in the corresponding classes.
                
                Create a proper interface hierarchy, so that each class implements the fewest possible interfaces (through inheritance).
                
                Finally, test your implementation by creating example classes such as:
                
                ●Car
                ●Bus
                ●Ship
                ●Airplane
                ●Amphibian
                
                Each class should include the necessary fields and methods from the interfaces.
                """);

        Car car = new Car();
        Bus bus = new Bus();
        Airplane airplane = new Airplane();
        Ship ship = new Ship();

        car.getInfo();
        bus.getInfo();
        airplane.getInfo();
        ship.getInfo();
    }
}
