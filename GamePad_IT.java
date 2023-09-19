
    package org.firstinspires.ftc.teamcode;
    {
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

    @TeleOp()
    public class GamePad_IT extends OpMode {
        @Override
        public void init() }
    }


        @Override
        public void loop() {
            double speedForward = -gamepad1.left_stick_y / 2.0;
            telemetry.addData("Left stick y", gamepad1.left_stick_y);
            telemetry.addData("speed Forward", speedForward);
          telemetry.addData("right stick X,gamepad1.right_stick_x");
                  telemertry.addData("B button, gamepadB.B_button");
           telemetry.addData("turbobobutton, gamedpad1.a");


    }