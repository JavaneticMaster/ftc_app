package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.vuforia.HINT;
import com.vuforia.Vuforia;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;

import static org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer.Parameters.CameraMonitorFeedback.AXES;

/**
 * Created by mvcsd on 11/15/2016.
 */

@Autonomous(name = "Vuforia Test", group = "Autonomous")
@Disabled
public class VuforiaTestOp extends LinearOpMode {

    public void runOpMode() throws InterruptedException {

        VuforiaLocalizer.Parameters params = new VuforiaLocalizer.Parameters(R.id.cameraMonitorViewId);
        params.cameraDirection = VuforiaLocalizer.CameraDirection.BACK;
        params.vuforiaLicenseKey = "AdYJ+xj/////AAAAGW5VH6kAdk84pGhQRuuX4q4ZfAaYGnsq7wGhSMyItdk7s5pq9d5KS/ZDnZXSqZb7P2/NFY+xKM+1mV+b+eUmJEChrbJ/xYKg/uGeERkTTIdgSfCtqu9rAyoAk47KkvrTzR30iPLS1Rnvl8vSt1OtU+ahk6GK4ltwJpMCmr8XcnTp7hD50AJUVh8ef1Q4QNCEMLZHyvb87R/+ZfUyYQicIYzTHBEGaXQM7FQoZsHUpBv8AIfNXGxOsAJknAQfbtv+zuWnwy+BBPtIqEorqkWn54BKcBic+23xFNBHCGyYyGWMIXY0VJ5CK7mEgHAmTtBSsKFZEVWfPz8y/nJONKbWHlQwFOISQNmBIDA7R+ekTAus";
        params.cameraMonitorFeedback = AXES;

        VuforiaLocalizer vuforia = ClassFactory.createVuforiaLocalizer(params);
        Vuforia.setHint(HINT.HINT_MAX_SIMULTANEOUS_IMAGE_TARGETS, 4);

    }

}
