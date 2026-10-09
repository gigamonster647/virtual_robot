package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class RumbleTest extends OpMode {

//    boolean wasA, isA;
    double endGameStart;
    boolean isEndGame;

    @Override
    public void init() {

    }

    public void start(){
        endGameStart=getRuntime()+90;
    }

    @Override
    public void loop() {
        if (endGameStart>=getRuntime() && !isEndGame){
            gamepad1.rumbleBlips(3);
            isEndGame=true;
        }
//        isA=gamepad1.a;
//
//        if (isA&& !wasA){
//            gamepad1.rumble(1.0, 0, 100);
//        }
//        wasA=isA;
    }
}
