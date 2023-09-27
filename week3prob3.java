package cs176;

public class week3prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car myCar = new Car(50);
		System.out.println("Total Gallons After Adding Fuel: " + myCar.getGas(10));
		System.out.println("Gallons Remaining: " + myCar.drive(12));
		System.out.println("Gallons of gas in car: " + myCar.getGas());
	}
		
	}

