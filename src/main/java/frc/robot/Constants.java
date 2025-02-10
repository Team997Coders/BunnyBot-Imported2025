// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.util.Arrays;
import java.util.List;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.I2C;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class Drivetrain  {
    public static final int frontRightCANID = 5; //CAN
    public static final int backRightCANID = 6;

    public static final int frontLeftCANID = 8;
    public static final int backLeftCANID = 7;

  }
    public static class Intake {
      public static final int intakeMotorID = 9; //PWM

      public static final int topLimitSwitchID = 1;//DIO
      public static final int bottomLimitSwitchID = 2;

      public static final double defaultSpinnerSpeed = 0.3;
    }
    
   public static class Indexer {
    public static final int FanChunkID = 0; //PWM
    public static final int escapeServoID = 1;

    public static final int bottomBeamBreakID = 0; //DIO
    public static final int topBeamBreakID = 1;

    
    public static final double escapeServoAngleDegrees = 0;
    public static final double closedServoAngleDegrees = 90;

    public static final I2C.Port i2cPort = I2C.Port.kMXP;
   }

   public static class Controller {
    public static final double controllerYDeadband = 0.05; //deadband to distinguish stationary from moving turning

    public static final double stationaryTurningFactor = 0.8; //turning factor when stationary. a value of 1, or 100%, may be too fast to control easily
    public static final double movingTurningFactor = 0.6; //turning factor when moving. a value of 1, or 100%, will have the robot pivot on the inside wheel. That's too fast!

    public static final double speedFactor = 0.5; //scalar for joystick inputs
   }


}
