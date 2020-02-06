
public class UsedCar extends Car {

	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return String.format("%15s %15s  %15d %15s %18s", getMake(), getModel(), getYear(), "$" + getPrice(),
				"(Used) " + mileage + " miles");
	}

}
