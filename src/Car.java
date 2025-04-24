public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // Override start() and stop() methods
    @Override
    public void start() {
        System.out.println("Car is starting with a roar...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping smoothly.");
    }
}