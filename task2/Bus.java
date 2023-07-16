package task2;

public class Bus extends Vehicle {

    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double getMaxSpeed() {
        return super.getMaxSpeed() * 0.6;
    }
}
