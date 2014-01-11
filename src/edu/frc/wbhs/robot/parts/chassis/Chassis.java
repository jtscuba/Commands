package edu.frc.wbhs.robot.parts.chassis;

/**
 *
 * @author Brendan, Brian
 */
public class Chassis {

	private DriveSide leftdrive;
	private DriveSide rightdrive;
    // TODO:
	// private Gyroscope gyro;
	// private Accelerometer accelerometer;
	// private SomeSensor weirdsensor;
	

	public Chassis(int[] leftdrivePinIDs, int[] rightdrivePinIDs) {
		leftdrive = new DriveSide(leftdrivePinIDs);
		rightdrive = new DriveSide(rightdrivePinIDs);
	}

	public boolean drive(double leftSidePower, double rightSidePower) {
		boolean failed = false;

		leftdrive.setSpeed(leftSidePower);
		rightdrive.setSpeed(rightSidePower);

		return failed;
	}

}
