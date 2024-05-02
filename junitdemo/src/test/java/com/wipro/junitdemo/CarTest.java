package com.wipro.junitdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testPetrolCarFillWithDiesel() {
        Car petrolCar = new Car("petrol");
        assertFalse(petrolCar.checkFuelFill("diesel"));
    }

    @Test
    public void testPetrolCarFillWithPetrol() {
        Car petrolCar = new Car("petrol");
        assertTrue(petrolCar.checkFuelFill("petrol"));
    }

    @Test
    public void testDieselCarFillWithPetrol() {
        Car dieselCar = new Car("diesel");
        assertFalse(dieselCar.checkFuelFill("petrol"));
    }

    @Test
    public void testDieselCarFillWithDiesel() {
        Car dieselCar = new Car("diesel");
        assertTrue(dieselCar.checkFuelFill("diesel"));
    }
}
