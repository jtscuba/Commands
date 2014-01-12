/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.wpi.first.wpilibj.templates;

import edu.frc.wbhs.robot.Robot;
import edu.frc.wbhs.robot.parts.chassis.Chassis;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.IterativeRobot;

public class RobotTemplate extends IterativeRobot {

	public int JOYSTICK = 1; // which joystick we are using, usually 1
	public static int X_AXIS_CHANNEL = 2; // which channel the x axis is on the joystick
	public static int Y_AXIS_CHANNEL = 1; // which channel the y axis is on the joystick
	public static int Z_AXIS_CHANNEL = 3; // which channel the z axis is on the joystick
	public static int[] RIGHT_SIDE_PINS = new int[]{1}; //which digital output the right side of the drive motors are
	public static int[] LEFT_SIDE_PINS = new int[]{2};
	public Robot robot;
	public Chassis chassis;
	public Joystick joystick;

	public void robotInit() {

		chassis = new Chassis(RIGHT_SIDE_PINS, LEFT_SIDE_PINS); //set up the chassis
		robot = new Robot(chassis); //feed it to the robot
		joystick = new Joystick(JOYSTICK);
	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {

	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		robot.drive(joystick, 0); // 0 = arcade, 1 = tank
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {

	}

}
