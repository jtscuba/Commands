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

    private Victor actualmotor;

    public Motor(int pinID) {
	actualmotor = new Victor(pinID);
    }

    public double getPower() {
	return actualmotor.getSpeed();
    }

    public void setSpeed(double power) {
	actualmotor.set(power);
    }

}
