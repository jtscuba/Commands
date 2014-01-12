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
