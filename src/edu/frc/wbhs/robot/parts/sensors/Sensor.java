/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.frc.wbhs.robot.parts.sensors;

/**
 *
 * @author Brian
 */
public abstract class Sensor {
    
    private int pinID;
    
    public Sensor(int pinID) {
	this.pinID = pinID;
    }
    
}