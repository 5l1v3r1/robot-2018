package org.usfirst.frc7108.Robot.commands;

import org.usfirst.frc7108.Robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSwitchFromMiddleStart extends CommandGroup {

    public RightSwitchFromMiddleStart() {
    	requires(Robot.sase);
    	this.addSequential(new AutonomousDrivePID(150));
    	this.addSequential(new AutonomousTurnPID(30));
    	this.addSequential(new AutonomousDrivee(1));
    	this.addSequential(new AutonomousDelay(0.5));
    	this.addSequential(new AutonomousTurnPID(0));
    	this.addParallel(new AutonomousLift(3));
    	this.addSequential(new AutonomousDrivee(1));
    	this.addSequential(new KutuBirak(3));
    }
}
