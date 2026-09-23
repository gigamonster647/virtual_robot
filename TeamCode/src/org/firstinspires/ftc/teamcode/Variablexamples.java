package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Variablexamples extends OpMode {
    public void init(){
        int teamNumber=12116;
        double motorSpeed=0.75;
        int motorAngle=45;
        boolean /*easter egg*/ snacksThere = true;
        String teamName="Redbots";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Motor Angle", motorAngle);
        telemetry.addData("Snacks There", snacksThere);
        telemetry.addData("Name", teamName);
    }

    public void loop(){

    }
}
