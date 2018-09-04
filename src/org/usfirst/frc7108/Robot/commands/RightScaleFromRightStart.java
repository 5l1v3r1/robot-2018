package org.usfirst.frc7108.Robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightScaleFromRightStart extends CommandGroup
{
	
	public RightScaleFromRightStart()
	{	
		
	this.addSequential(new AutonomousDrivePID(500));
	this.addSequential(new AutonomousDelay(0.1));
	this.addSequential(new AutonomousTurnPID(-30));
	this.addSequential(new AutonomousDelay(0.1));
	this.addSequential(new AutonomousDrivee(2));
	this.addSequential(new AutonomousDelay(0.1));
	this.addSequential(new AutonomousLift(3));
	this.addSequential(new AutonomousDelay(0.1));
	this.addSequential(new KutuBirak(3));
	
		
	}
	
}
