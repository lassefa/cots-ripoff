package org.usfirst.frc.team687.robot.subsystems;

import org.usfirst.frc.team687.robot.OI;
import org.usfirst.frc.team687.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

	// defining victors + double solenoid
	Victor flywheel1;
	Victor flywheel2;
	Victor artic;
	DoubleSolenoid piston;
	Compressor compressor;
	
	public Shooter() {
		// setting victors + double solenoid to ports
		compressor = new Compressor(); // compressor exists
		compressor.start(); // starting compressor
		flywheel1 = new Victor(RobotMap.fly1);
		flywheel2 = new Victor(RobotMap.fly2);
		artic = new Victor(RobotMap.armArtic);
		piston = new DoubleSolenoid(RobotMap.pistonPort1,RobotMap.pistonPort2);
	
	}
	
	public void articulation() {
		artic.set(OI.artic.getY()); // getting value from artic joystick
	}
	
	
	public void startWheels() {
		// setting flywheels to speed of 1
		flywheel1.set(RobotMap.wheelSpeed);
		flywheel2.set(RobotMap.wheelSpeed);
	}
	
	public void punchFrisbee() {
		//pistons going forward
		piston.set(DoubleSolenoid.Value.kForward);
	}
	
	public void unpunchFrisbee() {
		//pistons going back
		piston.set(DoubleSolenoid.Value.kReverse);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

