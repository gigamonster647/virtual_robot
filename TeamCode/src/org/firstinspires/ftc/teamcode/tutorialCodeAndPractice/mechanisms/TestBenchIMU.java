package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice.mechanisms;


import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class TestBenchIMU {
    private IMU imu;
    private DcMotor motor;
    private double ticksPerRev;

    public void init(HardwareMap hwMap){
        imu=hwMap.get(IMU.class, "imu");

        RevHubOrientationOnRobot RevOrientation = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.UP,
                RevHubOrientationOnRobot.UsbFacingDirection.FORWARD
        );

        imu.initialize(new IMU.Parameters(RevOrientation));

        motor=hwMap.get(DcMotor.class, "imuMotor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev=motor.getMotorType().getTicksPerRev();
    }

    public void setSpeed(double speed){
        motor.setPower(speed);
    }

    public double getTicksPerRev() {
        return ticksPerRev;
    }

    public double getHeading(AngleUnit angleUnit){
        return imu.getRobotYawPitchRollAngles().getYaw(angleUnit);
    }
}
