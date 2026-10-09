package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.tutorialCodeAndPractice.mechanisms.TestBenchIMU;

@TeleOp
public class IMUPractice extends OpMode {

    TestBenchIMU bench = new TestBenchIMU();


    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        double heading = bench.getHeading(AngleUnit.RADIANS);


        if (heading<0.5 && heading>-0.5){
            bench.setSpeed(0);
        }
        else if(heading>0.5){
            bench.setSpeed(0.5);
        }
        else{
            bench.setSpeed(-0.5);
        }

        telemetry.addData("Heading", bench.getHeading(AngleUnit.DEGREES));
        telemetry.addData("Heading (radians)", heading);
        telemetry.addData("TPR", bench.getTicksPerRev());
    }
}
