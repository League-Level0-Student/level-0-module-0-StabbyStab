import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPointWork {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Robot kill=new Robot();
		kill.hide();
		kill.setSpeed(1000000);
		String name=JOptionPane.showInputDialog("What is your name");
		String color=JOptionPane.showInputDialog("What is your favorite color, " + name);
		JOptionPane.showMessageDialog(null, color+" is my favovite color too.");
		kill.penDown();
		kill.setPenWidth(50);
		for (int i = 0; i < 5000; ) {
			kill.move(150);
			kill.setPenColor(kill.getX(), kill.getX(), kill.getX());
			kill.turn(50);

		}
	}

}
