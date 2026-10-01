package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench1 {

    private DcMotor motor;
    private double ticksPerRev; //revolution

    public void init(HardwareMap hwmap){
        motor=hwmap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev=motor.getMotorType().getTicksPerRev();
    }


    public void setMotor(double speed) {
        motor.setPower(speed);
    }

    public double getMotorRev() {
        return motor.getCurrentPosition()/ticksPerRev;
    }

}
