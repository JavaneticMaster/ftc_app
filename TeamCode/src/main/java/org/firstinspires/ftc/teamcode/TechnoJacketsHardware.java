package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * Created by mvcsd on 11/9/2016.
 */

public class TechnoJacketsHardware {

    /* Public OpMode members. */
    public DcMotor leftMotor;
    public DcMotor rightMotor;
    public DcMotor shootMotor;
    public DcMotor sweeper;
    //public Servo buttonServo;

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
        leftMotor = hwMap.dcMotor.get("leftMotor");
        rightMotor = hwMap.dcMotor.get("rightMotor");
        shootMotor = hwMap.dcMotor.get("shootMotor");
        sweeper = hwMap.dcMotor.get("sweeper");
        //buttonServo = hwMap.servo.get("buttonServo");

        // Set all motors to zero power
        leftMotor.setPower(0);
        rightMotor.setPower(0);
        shootMotor.setPower(0);


    }
}
