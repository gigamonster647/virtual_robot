package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class IfPractice extends OpMode{

    @Override
    public void init() {

    }

    @Override
    public void loop() {
//        boolean aButton = gamepad1.a;
//
//        if (aButton) {
//            telemetry.addData("A Button", "Pressed!");
//        }
//        else {
//            telemetry.addData("A Button", "Not pressed :(");
//        }
//        telemetry.addData("A Button State", aButton);
        double motorSpeed = gamepad1.left_stick_y;
        boolean turboPressed = gamepad1.a;

//        if (leftY < 0) {
//            telemetry.addData("Left Stick", "is Negative");
//        }
//        else if (leftY>0) {
//            telemetry.addData("Left Stick", "is Positive");
//        }
//        else {
//            telemetry.addData("Left Stick", "is Zero");
//        }

//        if (leftY<0.1 && leftY>-0.1) {
//            telemetry.addData("Left Stick", "is in Dead Zone");
//        }
        if (!turboPressed){
            motorSpeed*=0.5;
        }
        telemetry.addData("Left Stick Y Value", motorSpeed);
    }
}
