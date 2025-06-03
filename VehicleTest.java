public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        Truck truck = new Truck("Volvo", 2020, 10.5);

        System.out.println("Car Info:");
        car.displayInfo();

        System.out.println("\nTruck Info:");
        truck.displayInfo();
    }
}
