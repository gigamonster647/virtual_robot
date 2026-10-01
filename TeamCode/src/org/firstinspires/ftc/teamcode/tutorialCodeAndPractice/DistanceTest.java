package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.tutorialCodeAndPractice.mechanisms.TestBenchDistance;

@Disabled
@TeleOp
public class DistanceTest extends OpMode {

    TestBenchDistance bench = new TestBenchDistance();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        double distance = bench.getDistance();

        if (distance>10.0){
            telemetry.addLine("Too Close!");
        }


        telemetry.addData("Distance (cm)", distance);
    }
}
