package Testing9.vti.backend;

import Testing9.vti.enity.exe3.Car;

public class mainCar {
	public static void main(String[] args) {
		Car car = new Car("Mazda", "8WD");
		Car.Engine engine = car.new Engine("Crysler");
		
		System.out.println(car.getName());
		System.out.println(car.getType());
		System.out.println(engine.getEngineType());
	}
}
