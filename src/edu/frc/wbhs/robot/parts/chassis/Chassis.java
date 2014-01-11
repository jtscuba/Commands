/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.frc.wbhs.robot.parts.chassis;

import edu.frc.wbhs.robot.parts.Motor;

/**
 *
 * @author Brendan
 */
public class Chassis {
    
    private DriveSide leftdrive;
    private DriveSide rightdrive;
    // TO DO:
    // private Sensor gyro;
    // private Sensor accelerometer;
    // private Sensor weirdsensor;
    
    public Chassis(int[] leftdrivePinIDs, int[] rightdrivePinIDs) {
        leftdrive = new DriveSide(leftdrivePinIDs);
        rightdrive = new DriveSide(rightdrivePinIDs);
        
        /*
        To Polar:
        rot = Math.atan2(dy, dx);
        mag = Math.hypot(x, y);
        
        To Cartesian
        x = Math.cos(rot) * mag
        y = Math.sin(rot) * mag
        */
    }
    
    public boolean drive(double leftSidePower, double rightSidePower) {
        boolean failed = false;
        
        leftdrive.setSpeed(leftSidePower);
        rightdrive.setSpeed(rightSidePower);
        
        return failed;
    }
    
}
