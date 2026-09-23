package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@Autonomous
public class HelloWorld extends OpMode {

    @Override

    //init function
    /*
    adds data Hello World to the robot
     */
    public void init(){
        telemetry.addData("Hello", "Sreenidh P");
    }

    @Override
    public void loop(){

    }
}