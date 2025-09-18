package frc.robot;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import edu.wpi.first.math.geometry.*;

public final class FieldPoses {
  private static final List<Pose2d> CORAL_BLUE = List.of(
    new Pose2d(2.0, 1.4, new Rotation2d(0)),
    new Pose2d(2.0, 4.1, new Rotation2d(0)),
    new Pose2d(2.0, 6.7, new Rotation2d(0))
  );
  private static final List<Pose2d> CORAL_RED = List.of(
    new Pose2d(Constants.Field.FIELD_LENGTH-2.0, 1.4, new Rotation2d(Math.PI)),
    new Pose2d(Constants.Field.FIELD_LENGTH-2.0, 4.1, new Rotation2d(Math.PI)),
    new Pose2d(Constants.Field.FIELD_LENGTH-2.0, 6.7, new Rotation2d(Math.PI))
  );
  private static final List<Pose2d> REEF_BLUE = List.of(
    new Pose2d(6.6, 1.0, new Rotation2d(0)),
    new Pose2d(6.6, 7.2, new Rotation2d(0))
  );
  private static final List<Pose2d> REEF_RED = List.of(
    new Pose2d(Constants.Field.FIELD_LENGTH-6.6, 1.0, new Rotation2d(Math.PI)),
    new Pose2d(Constants.Field.FIELD_LENGTH-6.6, 7.2, new Rotation2d(Math.PI))
  );
  public enum Alliance { BLUE, RED }
  public static Pose2d B(Alliance a){ return a==Alliance.RED?Constants.Field.B_RED:Constants.Field.B_BLUE; }
  public static Pose2d randomCoral(Alliance a){ var l = a==Alliance.RED? CORAL_RED: CORAL_BLUE; return l.get(ThreadLocalRandom.current().nextInt(l.size())); }
  public static Pose2d randomReef (Alliance a){ var l = a==Alliance.RED? REEF_RED : REEF_BLUE; return l.get(ThreadLocalRandom.current().nextInt(l.size())); }
}