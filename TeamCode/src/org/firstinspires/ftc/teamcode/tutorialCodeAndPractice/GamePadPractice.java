package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode{

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        //runs 50x a second

        double speedForward=-gamepad1.left_stick_y / 2.0;
        telemetry.addData("left joystick x: ", gamepad1.left_stick_x);
        telemetry.addData("left joystick y: ", speedForward);

        telemetry.addData("right joystick x:", gamepad1.right_stick_x);
        telemetry.addData("right joystick y:", gamepad1.right_stick_y);

        telemetry.addData("a pressed?: ", gamepad1.a);
        telemetry.addData("b pressed?: ", gamepad1.b);

        double diff=gamepad1.left_stick_x-gamepad1.right_stick_x;
        telemetry.addData("difference x:", diff);

        double sumtriggs=gamepad1.left_trigger+gamepad1.right_trigger;
        telemetry.addData("sum of triggers:", sumtriggs);
    }

}
