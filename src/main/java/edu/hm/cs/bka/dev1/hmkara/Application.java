package edu.hm.cs.bka.dev1.hmkara;

import java.io.IOException;
import static edu.hm.cs.bka.dev1.hmkara.Kara.*;


public class Application {

	public static void main(String[] args) throws IOException {
		start();
		move();
		move();
		turnLeft();
		putLeaf();
//		putLeaf();
//		move();
//		move();
		say(""+isOnLeaf());
		turnRight();
		turnRight();
		move();	
		move();
		move();
		move();	
		move();
		move();

	}
}
