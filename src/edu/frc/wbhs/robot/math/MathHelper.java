/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.frc.wbhs.robot.math;

import java.util.Vector;

/**
 *
 * @author Brian
 */
public class MathHelper {
    
    public static Point2D toCartesian(double rot, double mag) {
		return new Point2D(Math.cos(rot) * mag, Math.sin(rot) * mag);
    }
    
    public static Vector toPolar(double x, double y) {
		return null;// new Vector(Math.atan2(y, x), Math.hypot(x, y));
    }
    
}
