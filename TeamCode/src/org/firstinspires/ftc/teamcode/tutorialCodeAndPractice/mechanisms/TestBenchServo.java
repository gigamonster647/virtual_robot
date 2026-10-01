package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice.mechanisms;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class TestBenchServo {
    private Servo servoPos;

    private CRServo servoRot;

    public void init(HardwareMap hwMap){
        servoPos =hwMap.get(Servo.class, "servo_pot");
        servoRot=hwMap.get(CRServo.class, "servo_rot");

        servoPos.scaleRange(0.5, 1); //set range from midpoint to 180
        servoPos.setDirection(Servo.Direction.REVERSE);
        servoRot.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setServoPos(double angle) {
        servoPos.setPosition(angle);
    }

    public void setServoRot(double power){
        servoRot.setPower(power);
    }
}
