import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot droid= new Robot();
		//2. Set the speed to 100
	droid.setSpeed(100);
	
	
	int colorChoice=JOptionPane.showOptionDialog(null, "Choose a Color", "???", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Orange","Yellow", "Green","Blue","Magenta"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==0) {
			droid.setPenColor(Color.RED);
		}
		
		if(colorChoice==1) {
			droid.setPenColor(Color.ORANGE);
		}
		
		if(colorChoice==2) {
			droid.setPenColor(Color.YELLOW);
		}
		if(colorChoice==3) {
			droid.setPenColor(Color.GREEN);
		}
		if(colorChoice==4) {
			droid.setPenColor(Color.BLUE);
		}
		if(colorChoice==5) {
			droid.setPenColor(Color.MAGENTA);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String many= JOptionPane.showInputDialog("How many polygons do you want to draw?");
		//5. Use the robot to draw the number of polygons the user requested.
		int polys= Integer.parseInt(many); 
	
		for (int i = 0; i < polys; i++) {
			droid.penDown();
			for (int j = 0; j <4; j++) {
				droid.turn(90);
				droid.move(100);
			}	
			droid.turn(15);
			
		}
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

