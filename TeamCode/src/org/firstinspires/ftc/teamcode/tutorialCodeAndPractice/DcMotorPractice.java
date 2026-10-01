package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.tutorialCodeAndPractice.mechanisms.TestBench;

@TeleOp
public class DcMotorPractice extends OpMode {

    TestBench bench = new TestBench();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;
//        if (bench.isTouchSensorPressed()){
//            bench.setMotor(0.5);
//        }
//        else {
//            bench.setMotor(0.0);
//        }
        bench.setMotor(motorSpeed);

        if (gamepad1.a) {
            bench.setMotorZPB(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if (gamepad1.b) {
            bench.setMotorZPB(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        telemetry.addData("motor revs", bench.getMotorRev());
    }
}
