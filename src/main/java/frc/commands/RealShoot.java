package frc.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

//Run this to shoot
public class RealShoot extends SequentialCommandGroup {
    public RealShoot() {
        addCommands(new GetDistanceToTarget(), new ShootWithSensors());
    }
}
