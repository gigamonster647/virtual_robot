package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;

public class RobotStatus {
    double x, y, speed, angle;
    SpeedClasses speedClass;

    public enum SpeedClasses{
        STOPPED,
        SLOW,
        REGULAR,
        TURBO,
        UNKNOWN
    }


    //init class
    public RobotStatus(double x,double y , double angle, double speed, SpeedClasses speedClass){
        this.x=x;
        this.y=y;
        this.angle=angle;
        this.speed=speed;
        this.speedClass=speedClass;
    }

    //getters
    public double getX(){
        return this.x;
    }



    public double getY(){
        return this.y;
    }

    public double getSpeed(){
        return this.speed;
    }

    public double getAngle(){
        return this.angle;
    }

    //setters
    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }

    public void setSpeed(double speed){
        this.speed=speed;
    }

    public void setAngle(double angle){
        this.angle=angle;
    }

    public void setSpeedClass(){
        if (this.speed==0){
            speedClass= SpeedClasses.STOPPED;
        }
        else if (this.speed==0.5){
            speedClass= SpeedClasses.REGULAR;
        }
        else if (this.speed==0.25){
            speedClass= SpeedClasses.SLOW;
        }
        else if (this.speed==1) {
            speedClass= SpeedClasses.TURBO;
        }
        else {
            speedClass = SpeedClasses.UNKNOWN;
        }
    }

    //changers
    public void changeX(double x_change){
        this.x+=x_change;
    }

    public void changeY(double y_change){
        this.y+=y_change;
    }

    public void changeSpeed(double speed_change){
        this.speed+=speed_change;
    }

    public void changeAngle(double angle_change){
        this.angle+=angle_change;
    }

}
