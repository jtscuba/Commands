/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.frc.wbhs.robot.parts.chassis;

/**
 *
 * @author Brendan
 */
public class Chassis {
    
    private DriveSide leftdrive;
    private DriveSide rightdrive;
    // TODO:
    // private Sensor gyro;
    // private Sensor accelerometer;
    // private Sensor weirdsensor;
    
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
