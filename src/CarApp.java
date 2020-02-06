import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		List<Car> cars = new ArrayList<>();

		greeting();

		int numberOfCars = Validator.getNaturalWithoutZero(scnr, "How many cars are you entering? "); //accepts negatives
		
		for (int i = 0; i < numberOfCars; i++) {

			String make = Validator.getString(scnr, "Enter Car #" + (i + 1) + " Make: ");
			String model = Validator.getString(scnr, "Enter Car #" + (i + 1) + " Model: ");
			int year = Validator.getNaturalWithoutZero(scnr, "Enter Car #" + (i + 1) + " Year: ");
			double price = Validator.getDouble(scnr, "Enter Car #" + (i + 1) + " Price: ");

			Car car = new Car(make, model, year, price);
			cars.add(car);
			
		}
		
		printInventory(cars);
		
		scnr.close();
	}
	
	public static void greeting() {
		System.out.println("Welcome to the Grand Circus Motors admin console!");
	}
	
	public static void printInventory(List<Car> cars) {
		System.out.println("Current Inventory: ");
		for (Car car : cars) {
			System.out.println(car);
		}
	}

}
