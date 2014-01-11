/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.frc.wbhs.robot.parts.chassis;

import edu.frc.wbhs.robot.parts.Motor;
import edu.frc.wbhs.robot.parts.Wheel;

/**
 *
 * @author Brendan, Brian
 */
public class DriveSide {

	public Wheel drivewheel;

	public DriveSide(int[] pinIDs) {
		drivewheel = new Wheel(new Motor(pinIDs[0]));
	}

	public void setSpeed(double speed) {
		drivewheel.getMotor().setSpeed(speed);
	}

}
