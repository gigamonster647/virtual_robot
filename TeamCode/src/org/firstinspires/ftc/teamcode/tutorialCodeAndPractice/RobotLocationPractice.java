package org.firstinspires.ftc.teamcode.tutorialCodeAndPractice;



public class RobotLocationPractice {
    double angle;
    double x;
    double y;

    //consturctor method
    public RobotLocationPractice(double angle, double x, double y) {
        this.angle = angle;
        this.x = x;
        this.y=y;
    }

    //normalizes robot heading between -180 and 180
    public double getHeading() {
        double angle = this.angle;
        while (angle>180) {
            angle -= 360;
        }

        while (angle <=-180) {
            angle +=360;
        }

        return angle;
    }


    public void turnRobot(double angleChange){
        angle += angleChange;
    }

    public void setAngle(double angle) {
        this.angle=angle;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x=x;
    }

    public void changeX(double xChange) {
        this.x+=xChange;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y=y;
    }

    public void changeY(double yChange) {
        this.y+=yChange;
    }
}
