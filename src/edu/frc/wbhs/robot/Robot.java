package edu.frc.wbhs.robot;

import edu.frc.wbhs.robot.parts.chassis.Chassis;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.templates.RobotTemplate;

/**
 *
 * @author Brendan
 */
/* TODO: add all the other parts that we need and set the joystick up for them
 make sure we're only sending the requested power down through a method
 so we can change it without messing with this class */
public class Robot {

	Chassis c;

	public Robot(Chassis chassis) {
		this.c = chassis;
	}

	public void drive(Joystick j, int mode) { // mode: 0 = arcade, 1 = tank

		// pull axes from the joystick	
		double xAxis = j.getRawAxis(RobotTemplate.X_AXIS_CHANNEL);
		double yAxis = j.getRawAxis(RobotTemplate.Y_AXIS_CHANNEL);
		double zAxis = j.getRawAxis(RobotTemplate.Z_AXIS_CHANNEL);
		c.drive(xAxis, yAxis, mode);
	}
}
