/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.frc.wbhs.robot.parts;

/**
 *
 * @author Brendan
 */
public class Motor {
    
    // From -1.0 to 1.0
    private double power;
    private double rotation;
    
    public Motor() {
        power = 0;
        rotation = 0;
    }
    
    public double getPower() {
        return power;
    }
    
    // public double currentRotation()
    
}
