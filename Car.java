package cs176;

public class Car {

	public double fuelEfficiency;
	public double fuelLevel;
		
	public Car (double mileage) {
		fuelEfficiency = mileage;
}
		
	public double fuel () {
		return fuelLevel;
}
	public double plusGas(double fuel) {
		return fuelLevel += fuel;
}
	public double drive(double distance) {
		double totalMiles = fuelLevel * fuelEfficiency;
		double miles = totalMiles-distance;
		fuelLevel = miles/fuelEfficiency;
		return fuelLevel;
}
		
	public double getGas() {
		return fuelLevel;
}
		
		
}
	
