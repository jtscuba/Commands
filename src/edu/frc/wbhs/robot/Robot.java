/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.frc.wbhs.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author Brendan
 */
public class Robot {
    void Robot() {
        //do nothing
    }
    public static void drive(Joystick j, int mode) { // 0 = arcade, 1 = tank
        int xAxis = j.getRawAxis(X_AXIS_CHANNEL);
        
    }
}
