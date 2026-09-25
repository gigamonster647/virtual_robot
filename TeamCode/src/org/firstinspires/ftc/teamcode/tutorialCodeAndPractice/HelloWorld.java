package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

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