package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.vuforia.HINT;
import com.vuforia.Vuforia;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;
import org.firstinspires.ftc.robotcore.external.matrices.VectorF;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackableDefaultListener;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;

import static org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer.Parameters.CameraMonitorFeedback.AXES;

/**
 * Created by mvcsd on 11/15/2016.
 */

@Autonomous(name = "Vuforia Test", group = "Autonomous")

public class VuforiaTestOp extends LinearOpMode {

    public void runOpMode() throws InterruptedException {

        VuforiaLocalizer.Parameters params = new VuforiaLocalizer.Parameters(R.id.cameraMonitorViewId);
        params.cameraDirection = VuforiaLocalizer.CameraDirection.BACK;
        params.vuforiaLicenseKey = "AdYJ+xj/////AAAAGW5VH6kAdk84pGhQRuuX4q4ZfAaYGnsq7wGhSMyItdk7s5pq9d5KS/ZDnZXSqZb7P2/NFY+xKM+1mV+b+eUmJEChrbJ/xYKg/uGeERkTTIdgSfCtqu9rAyoAk47KkvrTzR30iPLS1Rnvl8vSt1OtU+ahk6GK4ltwJpMCmr8XcnTp7hD50AJUVh8ef1Q4QNCEMLZHyvb87R/+ZfUyYQicIYzTHBEGaXQM7FQoZsHUpBv8AIfNXGxOsAJknAQfbtv+zuWnwy+BBPtIqEorqkWn54BKcBic+23xFNBHCGyYyGWMIXY0VJ5CK7mEgHAmTtBSsKFZEVWfPz8y/nJONKbWHlQwFOISQNmBIDA7R+ekTAus";
        params.cameraMonitorFeedback = AXES;

        VuforiaLocalizer vuforia = ClassFactory.createVuforiaLocalizer(params);
        Vuforia.setHint(HINT.HINT_MAX_SIMULTANEOUS_IMAGE_TARGETS, 4);

        VuforiaTrackables beacons = vuforia.loadTrackablesFromAsset("FTC_2016-2017");

        beacons.setName("Wheels");
        beacons.setName("Tools");
        beacons.setName("Legos");
        beacons.setName("Gears");

        waitForStart();

        beacons.activate();

        while (opModeIsActive()) {
            for (VuforiaTrackable beac : beacons) {
                OpenGLMatrix pose = ((VuforiaTrackableDefaultListener) beac.getListener()).getPose();

                if (pose != null) {
                    VectorF translation = pose.getTranslation();

                    telemetry.addData(beac.getName() + "- Translation", translation);

                    double degreesToTurn = Math.toDegrees(Math.atan2(translation.get(1), translation.get(2)));

                    telemetry.addData(beac.getName() + "- Degrees", degreesToTurn);
                }
                telemetry.update();
            }

        }

    }

}
