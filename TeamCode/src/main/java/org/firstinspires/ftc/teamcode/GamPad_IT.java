package org.firstinspires.ftc.teamcode;

 import com.acmerobotics.dashboard.FtcDashboard;
 import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
 import com.qualcomm.robotcore.eventloop.opmode.OpMode;
 import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
 import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp()
public class GamPad_IT extends OpMode {
     private DcMotor motor1;
    @Override
     public void init(){
        FtcDashboard dashboard= FtcDashboard.getInstance();
        telemetry = new MultipleTelemetry(telemetry, dashboard.getTelemetry())        ;

     }

     @Override
 public void loop() {
         double ySpeed = gamepad1.left_stick_y;
         double xSpeed = gamepad1.left_stick_x;
         double forwardSpeed = gamepad1.left_stick_y;
         if (gamepad1.a) { // crazy mode
             forwardSpeed = forwardSpeed * 1;
             ySpeed = gamepad1.left_stick_x;
             xSpeed = gamepad1.left_stick_y;
         }
         else {
             forwardSpeed *= 0.5;
         }
         telemetry.addData("X Speed", xSpeed);
         telemetry.addData("Y Speed", ySpeed);
         telemetry.addData("Forward Seed" , forwardSpeed);
     }}