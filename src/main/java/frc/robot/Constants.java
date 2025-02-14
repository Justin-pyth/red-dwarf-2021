// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //Make global variables all uppercase
    public static final int LEFT_FRONT_MOTOR_CAN_ID = 0;
    public static final int RIGHT_FRONT_MOTOR_CAN_ID = 1;
    public static final int LEFT_REAR_MOTOR_CAN_ID = 2;
    public static final int RIGHT_REAR_MOTOR_CAN_ID = 3;

    public static final GenericHID.Hand LEFT_JOY_AXIS = Hand.kLeft;
    public static final GenericHID.Hand RIGHT_JOY_AXIS = Hand.kRight;

    public static final int GYRO_ID = 0;
    public static final int DISTANCE_SENSORE_PING_CHANNEL = 0;
    public static final int DISTANCE_SENSORE_ECHO_CHANNEL = 1;
    public static final int JOYSTICK_CAN_ID = 1;
}
