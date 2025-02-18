package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class MotorRunFast_OF extends OpMode {

    private DcMotor motor1;

    @Override
    public void init(){
        FtcDashboard dashboard = FtcDashboard.getInstance();
        telemetry = new MultipleTelemetry(telemetry, dashboard.getTelemetry());
    }
@Override
    public void loop(){
        if(gamepad1.a) {
            motor1.setPower(1);
        }
        telemetry.update();
    }
}
