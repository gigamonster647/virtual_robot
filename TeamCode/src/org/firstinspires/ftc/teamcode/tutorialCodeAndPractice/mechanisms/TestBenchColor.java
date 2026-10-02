package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice.mechanisms;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestBenchColor {
    NormalizedColorSensor colorSensor;

    public enum DetectedColor {
        RED,
        BLUE,
        YELLOW,
        UNKNOWN
    }

    public void init(HardwareMap hwMap){
        colorSensor=hwMap.get(NormalizedColorSensor.class, "colorSensor1");
        colorSensor.setGain(8); //gain is strength of sensor, default is 1, just increases or decreases values
    }

    public DetectedColor getDetectedColor(){
        NormalizedRGBA colors = colorSensor.getNormalizedColors(); //return 4 values R, G, B and alpha which is brightness, i think from 0-1

        float normRed, normBlue, normGreen;
        normRed=colors.red/colors.alpha;
        normBlue=colors.blue/colors.alpha;
        normGreen=colors.green/colors.alpha;

        /*
        red, green, blue
        RED = >.35, <.3, <.3
        YELLOW = >.5, >.9, <.6
        BLUE = <.2, <.5, >.5
         */

        if (normRed>0.35 && normBlue<0.3 && normGreen<0.3){
            return DetectedColor.RED;
        }
        else if (normRed>.5 && normBlue>.6 && normGreen<.9){
            return DetectedColor.YELLOW;
        }
        else if (normRed<0.2 && normBlue>0.5 && normGreen<0.5){
            return DetectedColor.BLUE;
        }
        else{
            return DetectedColor.UNKNOWN;
        }


    }

}
