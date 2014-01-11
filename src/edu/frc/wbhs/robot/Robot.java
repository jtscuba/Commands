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

		/* TODO: put this code into the chassis drive method, there's too many
		 continuous lines of code for this high up the object tree */
		
		// pull axes from the joystick	
		double xAxis = j.getRawAxis(RobotTemplate.X_AXIS_CHANNEL);
		double yAxis = j.getRawAxis(RobotTemplate.Y_AXIS_CHANNEL);
		double zAxis = j.getRawAxis(RobotTemplate.Z_AXIS_CHANNEL);

		if (mode == 0) { // arcade mode is selected
			double requestedLinearSpeed = xAxis;
			double requestedAngularSpeed = yAxis;
			double rightSidePower = (requestedLinearSpeed + requestedAngularSpeed); //this might turn the wrong way
			double leftSidePower = (requestedLinearSpeed - requestedAngularSpeed);
			/*put the gyroscope code here, add the pid to the power for one side, 
			 subtract it from the pother in order to approach the correct angular speed*/

			c.drive(leftSidePower, rightSidePower);

		}

	}
}
