package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.VehBusinessLogic;
import model.Vehicle;

public class TestVehicleLogic2 {

		VehBusinessLogic vehBL = new VehBusinessLogic();
		Vehicle vehicle = new Vehicle("Nissan", "Altima");

		@Before
		public void setUp() throws Exception {
		}

		@Test
		public void testCalculateDepreciation() {
			vehicle.setPrice(20000);
			vehicle.setAge(8);
			double value = vehBL.calculateDepreciation(vehicle);
			assertTrue(value == 8609.35);
		}
		
		@Test
		public void testCalculateDeductible() {
			vehicle.setPrice(18000);
			double value = vehBL.calculateDeductible(vehicle);
			assertFalse(value == 500);
		}

}
