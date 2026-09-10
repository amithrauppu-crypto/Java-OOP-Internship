class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with self-start");
    }
}

public class VehicleInheritanceExample {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        bike.start();
    }
}
