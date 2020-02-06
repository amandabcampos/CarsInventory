import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		Car car1 = new Car("Nikolai", "Model S", 2017, 54999.90);
		Car car2 = new Car("Fourd", "Escapade", 2017, 31999.90);
		Car car3 = new Car("Chewie", "Vette", 2017, 44989.95);
		Car car4 = new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6);
		Car car5 = new UsedCar("GC", "Chirpus", 2013, 8500, 12345);
		Car car6 = new UsedCar("GC", "Witherell", 2016, 14450, 3500.3);

		List<Car> cars = new ArrayList<>();

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);

		boolean looping = true;
		while (looping) {

			displayCars(cars);
			System.out.println((cars.size() + 1) + ". Quit");

			int index = Validator.getNaturalWithoutZero(scnr, "Which car would you like? ") - 1;

			if (index == (cars.size())) {
				System.out.print("Have a great day!");
				break;
			}

			System.out.println(cars.get(index));
			System.out.println("Would you like to buy this car?");
			if (scnr.nextLine().startsWith("y")) {
				System.out.println("Excellent! Our financial department will be in touch shortly");
				cars.remove(index);
			}

		}
		scnr.close();

	}

	public static void displayCars(List<Car> cars) {
		for (Car car : cars) {
			if (car instanceof UsedCar) {
				System.out.print((cars.indexOf(car) + 1) + ".");
				System.out.println((UsedCar) car);
			} else {
				System.out.print(cars.indexOf(car) + 1 + ".");
				System.out.println(car);
			}
		}
	}

}
