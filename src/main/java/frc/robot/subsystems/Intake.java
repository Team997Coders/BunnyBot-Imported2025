package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

    private final VictorSP intakeMotor = new VictorSP(Constants.Intake.intakeMotorID);

    public Intake(){
        

    }
    

    public void spinFlapper(double percentSpeed){
        intakeMotor.set(percentSpeed);
    }




}
