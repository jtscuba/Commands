/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.frc.wbhs.robot;

import edu.frc.wbhs.robot.parts.chassis.Chassis;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.templates.IterativeBase;

/**
 *
 * @author Brendan
 */
public class Robot {
    void Robot(Chassis c) {
        //do nothing
    }
    public static void drive(Joystick j, int mode) { // 0 = arcade, 1 = tank
        
// pull axes TODO: make sure it works		
		double xAxis = j.getRawAxis(IterativeBase.X_AXIS_CHANNEL);
		double yAxis = j.getRawAxis(IterativeBase.Y_AXIS_CHANNEL);
		double zAxis = j.getRawAxis(IterativeBase.Z_AXIS_CHANNEL);
		
		if (mode == 0){ // arcade mode is selected
			double requestedLinearSpeed = xAxis;
			double requestedAngularSpeed = yAxis;
			double rightSidePower = requestedLinearSpeed + requestedAngularSpeed;
			double leftSidePower = requestedLinearSpeed - requestedAngularSpeed;
			
		}
		
        
    }
}
