package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.tutorialCodeAndPractice.mechanisms.ArcadeDrive;

@Autonomous
public class ArcadeDriveOpmode extends OpMode {

    ArcadeDrive drive = new ArcadeDrive();

    double throttle, spin;

    @Override
    public void init() {
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        throttle = -gamepad1.left_stick_y;
        spin = gamepad1.left_stick_x;

        drive.drive(throttle, spin);
    }
}
