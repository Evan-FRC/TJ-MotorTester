/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */
public class DriveMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  TalonSRX driveMotor;

 public DriveMotor() {
    driveMotor = new TalonSRX(RobotMap.driveMotorNumber);
 } 

 public void set(double power){
  driveMotor.set(ControlMode.PercentOutput, power);
 }

 public void updateDashboard(){
  SmartDashboard.putNumber("Drive Motor Current", driveMotor.getOutputCurrent());
  SmartDashboard.putNumber("Drive Motor Voltage", driveMotor.getMotorOutputVoltage());
 }
 
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
