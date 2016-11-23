package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Sam Mader on 11/22/2016.
 */

@TeleOp(name = "Motor Test", group = "TeleOp")
public class MotorTestOp extends OpMode {

    TechnoJacketsHardware robot = new TechnoJacketsHardware();

    public void init() {

        robot.init(hardwareMap);

    }

    public void loop() {

        double power;

        power = gamepad1.left_stick_y;

        robot.shootMotor.setPower(power);

    }

}
