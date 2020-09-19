import static edu.hm.cs.bka.hmkara.Kara.*;

import edu.hm.cs.bka.hmkara.Kara;
public class AufgabeMissionImpossible{

	public static void main(String[] args) {
		move();
		int i = Kara.askNumber("Guess a Number");
		turnRight();
		move();
		move();
		move();
		turnLeft();
		move();
		move();
		turnLeft();
		move();
		turnRight();
		move();
		pickLeaf();
		Kara.say("Yay " + i);
	}

	
}
