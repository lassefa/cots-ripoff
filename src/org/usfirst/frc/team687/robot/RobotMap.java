/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team687.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	// setting port values 
	public static int frontLeft = 0;
	public static int frontRight = 1;
	public static int backLeft = 2;
	public static int backRight = 3;
	public static int fly1 = 4;
	public static int fly2 = 5;
	public static int pistonPort1 = 6;
	public static int pistonPort2 = 7;
	public static int armArtic = 8;
	
	// the joystick ports are separate hence the overlapping numbers
	
	public static int joy1 = 0;
	public static int joy2 = 1;
	public static int articulation = 2;
	
	// setting speed of flywheels
	
	public static int wheelSpeed = 1;
}
