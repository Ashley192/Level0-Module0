package _99_extra;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // Make a new Robot
Robot bob = new Robot();
bob.miniaturize();

        // Put the robot's pen down
bob.penDown();

        // Make the robot move as fast as possible
bob.setSpeed(1000);

    	// COUNT. Create an int variable that will count how many sides of the shape we have drawn.
    	//        The start value will be zero because no sides have yet been drawn. Use this code:
		  /**     int sides = 0;    **/
    	int sides = 0;
    	
        // Start a while loop to repeat the MOVE, TURN, and COUNT code 4 times

    	while (sides<10) {
			
		
        //         MOVE your robot 200 pixels
bob.move(200);

        //         TURN the robot 90 degrees to the right
    	bob.turn(90);
    	
    	//         COUNT. Add one to the number of sides the robot has drawn      sides+=1;
sides+=1;
    	
    	// End the while loop here
    	}
    	// Run the program. You should see a square
    	
    	
    	// Now change the code to draw a different shape 
    	// e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)
   
    }
}
