package tests;

/**
 * @author AlSnyder - asnyder7
 * CIS175 - SPRING 2022
 * Jan 27, 2022
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.VehBusinessLogic;
import model.Vehicle;

public class TestVehicleLogic1 {
	
	VehBusinessLogic vehBL = new VehBusinessLogic();
	Vehicle vehicle = new Vehicle("Ford", "Taurus");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateDepreciation() {
		vehicle.setPrice(15000);
		vehicle.setAge(6);
		double value = vehBL.calculateDepreciation(vehicle);
		assertEquals(7971.62, value, 0.00);
	}
	
	@Test
	public void testCalculateDeductible() {
		vehicle.setPrice(7000);
		double value = vehBL.calculateDeductible(vehicle);
		assertEquals(500, value, 0.0);
	}

}
