/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.frc.wbhs.robot.parts;

import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author Brendan, Brian
 */
public class Motor {
    
    // From -1.0 to 1.0
    private double power;
    private double rotation; // Don't know if needed
    private Victor actualmotor;
    
    public Motor(int pinID) {
        power = 0;
        rotation = 0;
	actualmotor = new Victor(pinID);
    }
    
    public double getPower() {
        return power;
    }
    
    public void setSpeed(double power) {
	this.power = power;
    }
    
    // public double currentRotation()
    
}
