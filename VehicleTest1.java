class Vehicle1 {
    private String brand;
    private int year;
    private double fuel;

    public Vehicle1(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.fuel = 0.0;
    }

    public void refuel(double amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println("Refueled " + amount + " liters. Total fuel: " + fuel + " liters.");
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Fuel: " + fuel + " liters");
    }
}

class Car extends Vehicle1 {
    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}

class Truck extends Vehicle1 {
    private double loadCapacity;

    public Truck(String brand, int year, double loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

public class VehicleTest1  {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        Truck truck = new Truck("Volvo", 2020, 10.5);

        System.out.println("Car Info:");
        car.refuel(40);
        car.displayInfo();

        System.out.println("\nTruck Info:");
        truck.refuel(120);
        truck.displayInfo();
    }
}