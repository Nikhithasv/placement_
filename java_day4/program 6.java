

public class VehicleSpeedComparison {
    public static void main(String[] args) {
      
        Car car = new Car(60.0, 4);  
        Motorcycle motorcycle = new Motorcycle(80.0, 2); 
        double carSpeed = car.calcSpeed();
        double motorcycleSpeed = motorcycle.calcSpeed();
        String fastestVehicle;
        if (carSpeed > motorcycleSpeed) {
            fastestVehicle = "Car";
        } else if (carSpeed < motorcycleSpeed) {
            fastestVehicle = "Motorcycle";
        } else {
            fastestVehicle = "Both vehicles have the same speed.";
        }

        System.out.println("Car Speed: " + carSpeed);
        System.out.println("Motorcycle Speed: " + motorcycleSpeed);
        System.out.println("The fastest vehicle is: " + fastestVehicle);
    }
}

class Vehicle {
    private double speed;

    public Vehicle(double speed) {
        this.speed = speed;
    }

    public double calcSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    private int numPassengers;

    public Car(double speed, int passengers) {
        super(speed);
        this.numPassengers = passengers;
    }

    @Override
    public double calcSpeed() {
      
        return super.calcSpeed() * numPassengers;
    }
}

class Motorcycle extends Vehicle {
    private int numWheels;

    public Motorcycle(double speed, int wheels) {
        super(speed);
        this.numWheels = wheels;
    }

    @Override
    public double calcSpeed() {
      
        return super.calcSpeed() * numWheels;
    }
}
