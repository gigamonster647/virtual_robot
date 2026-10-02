package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class ColorSensorTest extends OpMode {

    TestBenchColor bench= new TestBenchColor();
    TestBenchColor.DetectedColor detectedColor;

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        detectedColor=bench.getDetectedColor();
        telemetry.addData("Color Detected", detectedColor);
    }
}
