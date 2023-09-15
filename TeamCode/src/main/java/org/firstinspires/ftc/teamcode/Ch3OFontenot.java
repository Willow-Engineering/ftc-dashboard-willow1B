package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class Ch3OFontenot extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double ySpeed = gamepad1.left_stick_y;
        double xSpeed = gamepad1.left_stick_x;
        double forwardSpeed = gamepad1.left_stick_y;
        if (gamepad1.a) { // crazy mode
            ySpeed = gamepad1.left_stick_x;
            xSpeed = gamepad1.left_stick_y;
        }
        else {
            forwardSpeed *= 0.5;
        }
        telemetry.addData("X Speed", xSpeed);
        telemetry.addData("Y Speed", ySpeed);
        telemetry.addData("Forward Seed" , forwardSpeed);
    }
}
