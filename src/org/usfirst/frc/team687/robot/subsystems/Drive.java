package org.usfirst.frc.team687.robot.subsystems;

import org.usfirst.frc.team687.robot.OI;
import org.usfirst.frc.team687.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	// these victors exist
	Victor victorFL;
	Victor victorFR;
	Victor victorBL;
	Victor victorBR;
	
	
	public Drive() {
		// assigning victors to ports
		 victorFL = new Victor(RobotMap.frontLeft);
		 victorFR = new Victor(RobotMap.frontRight);
		 victorBL = new Victor(RobotMap.backLeft);
		 victorBR = new Victor(RobotMap.backRight);
	}
	
	public void tankDrive() {
		// setting motor to the values joystick gives out
		victorFR.set(OI.stick.getY());
		victorBR.set(OI.stick.getY());
		victorFL.set(-OI.stick2.getY());
		victorBL.set(-OI.stick2.getY());
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

