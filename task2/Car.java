package task2;

public class Car extends Vehicle{

	public Car(int maxSpeed) {
		super(maxSpeed);
		
        
	}

	@Override
	public double getMaxSpeed() {
	
		return super.getMaxSpeed()*0.8;
	}
    
}
