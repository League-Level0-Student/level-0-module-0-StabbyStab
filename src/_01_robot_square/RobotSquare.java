package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot win=new Robot();
Robot win2=new Robot();
Robot win3=new Robot();
Robot win4=new Robot();
//Robot win5=new Robot();
        // 3. Put the robot's pen down
win.hide();
win2.hide();
win3.hide();
win4.hide();
win.penDown();
win2.penDown();
win3.penDown();
win4.penDown();
//win5.penDown();
        // 6. Make the robot move as fast as possible
win.setSpeed(10);
win2.setSpeed(10);
win3.setSpeed(10);
win4.setSpeed(10);
win3.turn(180);
win4.turn(180);
win.setPenWidth(50);
win2.setPenWidth(50);
win3.setPenWidth(50);
win4.setPenWidth(50);
        // 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {
	

        //         2. Move your robot 200 pixels
	for (int j = 0; j < 10; j++) {
		System.out.println(win.getX()/2);
	win.setPenColor((win.getX()-50), win.getX()/5, win.getY());
	win2.setPenColor((win.getX()-50), win.getX()/5, win.getY());
	win3.setPenColor((win.getX()-50), win.getX()/5, win.getY());
	win4.setPenColor((win.getX()-50), win.getX()/5, win.getY());
	//win5.setPenColor((win.getX()-50), win.getX()/5, win.getY());
win.move(20);
win2.move(20);
win3.move(20);
win4.move(20);
//win5.move(20);
//win5.move(20);
//win5.move(20);
	}
        //         4. Turn the robot 90 degrees to the right (90 degrees)
win.turn(90);
win2.turn(-90);
win3.turn(90);
win4.turn(-90);

    }
win.hide();
win2.hide();
win3.hide();
win4.hide();
    }
}
