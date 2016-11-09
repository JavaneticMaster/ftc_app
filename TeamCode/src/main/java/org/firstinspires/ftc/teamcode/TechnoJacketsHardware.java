package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by mvcsd on 11/9/2016.
 */

public class TechnoJacketsHardware {

    /* Public OpMode members. */
    public DcMotor leftMotor;
    public DcMotor rightMotor;
    public DcMotor shootMotorL;
    public DcMotor shootMotorR;
    public DcMotor sweeper;
    public Servo buttonServo;

    public static final double fullStop = 0;

    /* local OpMode members. */
    HardwareMap hwMap =  null;

    /* Constructor */
    public TechnoJacketsHardware(){

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        leftMotor = hwMap.dcMotor.get("left_drive");
        rightMotor = hwMap.dcMotor.get("right_drive");
        shootMotorL = hwMap.dcMotor.get("shootMotorL");
        shootMotorR = hwMap.dcMotor.get("shootMotorR");
        sweeper = hwMap.dcMotor.get("sweeper");

        // Set all motors to zero power
        leftMotor.setPower(0);
        rightMotor.setPower(0);
        shootMotorL.setPower(0);
        shootMotorR.setPower(0);


    }
}
