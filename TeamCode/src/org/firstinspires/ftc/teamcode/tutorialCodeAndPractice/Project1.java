package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Project1 extends OpMode {

    @Override
    public void init() {
        //Task 1: Add simple string to telem
        telemetry.addLine("Hello Sreenidh!");

        //task 2: make team/robot info into vars and then display in telem
        String teamName = "Redbots";
        int teamNumber = 12116;
        double maxSpeed = 100;
        boolean clawClosed = false;


        telemetry.addData("Team Name", teamName);
        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Max Speed", maxSpeed);
        telemetry.addData("Claw Closed Status", clawClosed);
    }



    @Override
    public void loop() {
        //task 3 1: read left/right stick and move/turn

        RobotStatus robot = new RobotStatus(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x, 1.0, RobotStatus.SpeedClasses.TURBO);




        //task 4 1: adding deadzone for stick drift
        if (gamepad1.left_stick_x<0.1 && gamepad1.left_stick_x>0.1){
            robot.setX(0);
        }
        else if (gamepad1.left_stick_x==0){
            //bonus task make speed 0
            robot.setSpeed(0);
        }

        //task 4 2: turbo button
        if (!gamepad1.a){
            robot.setSpeed(0.5);
        }

        //task 4 4 if either bumper pressed then slow
        if (gamepad1.right_bumper || gamepad1.left_bumper){
            robot.setSpeed(0.25);
        }

        //task 4 5: if both bumpers pressed then stop
        if (gamepad1.right_bumper&& gamepad1.left_bumper){
            robot.setSpeed(0);
        }

        //task 4 3 + bonus: display certain speed class





        telemetry.addData("Robot X", robot.getX());
        telemetry.addData("Robot Y", robot.getY());
        telemetry.addData("Robot Angle", robot.getAngle());
        telemetry.addData("Robot Speed", robot.getSpeed());
        telemetry.addData("Speed Class", robot.speedClass);


        //task 3 2: read trigger sum and diff between x values
        double trigger_sum=gamepad1.left_trigger+gamepad1.right_trigger;
        double diff_sticks=gamepad1.left_stick_x-gamepad1.right_stick_x;

        telemetry.addData("Trigger Sum", trigger_sum);
        telemetry.addData("Difference Sticks", diff_sticks);



    }
}
