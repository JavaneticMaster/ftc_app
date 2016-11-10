package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by mvcsd on 11/10/2016.
 */

@TeleOp(name = "4510 TeleOp", group = "TeleOp")
public class TechnojacketsTeleop extends OpMode {

    TechnoJacketsHardware robot = new TechnoJacketsHardware();

    public void init() {

        robot.init(hardwareMap);

    }

    public void loop() {

        double leftSpeed;
        double rightSpeed;

        leftSpeed = gamepad1.left_stick_y;
        rightSpeed = gamepad1.right_stick_y;

        robot.leftMotor.setPower(leftSpeed);
        robot.rightMotor.setPower(rightSpeed);
    }

}
