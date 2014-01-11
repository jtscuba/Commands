/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.frc.wbhs.robot.parts;

/**
 *
 * @author Brendan
 */
public class Wheel {

	/**
	 * Diameter of the robot's wheels in inches.
	 */
	public static final double DIAMETER = 4.0;

	public Motor motor;

	public Wheel(Motor m) {
		this.motor = m;
	}

	public Motor getMotor() {
		return motor;
	}

	public double getSpeed() {
		return motor.getPower() * DIAMETER; //we have to measure the speed at full power to make this useful
	}

}
