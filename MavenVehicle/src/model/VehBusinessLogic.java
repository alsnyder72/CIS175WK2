package model;



/**
 * @author AlSnyder - asnyder7
 * CIS175 - SPRING 2022
 * Jan 27, 2022
 */

public class VehBusinessLogic {

	public double calculateDepreciation(Vehicle vehicle) {
		double value = vehicle.getPrice();
		// depreciates 10% of the remaining value for each year of age completed
		for (int i=0; i < vehicle.getAge(); i++) {
			value = value * 0.9;
			value = Math.round(value*100.0)/100.0;
			//System.out.println(value);
		}
		return value;
	}
	
	public double calculateDeductible(Vehicle vehicle) {
		double deductible = 0;
		
		if(vehicle.getPrice()<10000) {
			deductible = 500;
		}else {
			deductible = 1000;
		}
		return deductible;
	}
}
