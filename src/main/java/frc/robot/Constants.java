package frc.robot;

import edu.wpi.first.math.geometry.*;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

public final class Constants {
  public static final class CAN {
    public static final int FL_DRIVE=1, FL_TURN=2, FR_DRIVE=3, FR_TURN=4;
    public static final int BL_DRIVE=5, BL_TURN=6, BR_DRIVE=7, BR_TURN=8;
  }
  public static final class DIO {
    public static final int FL_ABS=0, FR_ABS=1, BL_ABS=2, BR_ABS=3;
  }
  public static final class Drive {
    public static final double TRACK_WIDTH = Units.inchesToMeters(20);
    public static final double WHEEL_BASE  = Units.inchesToMeters(20);
    public static final double WHEEL_RADIUS= Units.inchesToMeters(2);
    public static final double DRIVE_GEAR_RATIO=6.75;
    public static final double TURN_GEAR_RATIO =12.8;
    public static final double MAX_LINEAR_MPS  =4.0;
    public static final double MAX_ANG_RADPS   =Math.PI;

    public static final Translation2d FL_LOC= new Translation2d(+WHEEL_BASE/2, +TRACK_WIDTH/2);
    public static final Translation2d FR_LOC= new Translation2d(+WHEEL_BASE/2, -TRACK_WIDTH/2);
    public static final Translation2d BL_LOC= new Translation2d(-WHEEL_BASE/2, +TRACK_WIDTH/2);
    public static final Translation2d BR_LOC= new Translation2d(-WHEEL_BASE/2, -TRACK_WIDTH/2);

  }
}