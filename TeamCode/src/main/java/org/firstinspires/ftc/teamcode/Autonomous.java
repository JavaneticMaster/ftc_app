package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import static org.firstinspires.ftc.teamcode.TechnoJacketsHardware.fullStop;

/**
 * Created by mvcsd on 11/9/2016.
 */

public class Autonomous extends LinearOpMode {

    TechnoJacketsHardware robot = new TechnoJacketsHardware();

    public void runOpMode() {

        robot.init(hardwareMap);

        telemetry.addData("Status", "Time's up, let's do this.");    //
        telemetry.update();

        waitForStart();

        telemetry.clear();
        telemetry.addData("Status:", "LEEROOOOOOOY JEEEEENKINS");

        robot.leftMotor.setPower(1);
        robot.rightMotor.setPower(1);
        sleep(2000);
        robot.leftMotor.setPower(fullStop);
        robot.leftMotor.setPower(fullStop);
        sleep(300);
        robot.leftMotor.setPower(-1);
        robot.leftMotor.setPower(1);
        sleep(500);
        robot.leftMotor.setPower(fullStop);
        robot.rightMotor.setPower(fullStop);


    }

}
