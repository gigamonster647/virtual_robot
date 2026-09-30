package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.tutorialCodeAndPractice.mechanisms.TestBench;

@Disabled
@TeleOp
public class TouchSensorPractice extends OpMode {

    TestBench bench = new TestBench();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        String state;
        if (bench.isTouchSensorPressed()) {
            state="Pressed!";
        }

        else{
            state="Not Pressed :(";
        }

        telemetry.addData("Touch Sensor State", state);

    }
}
