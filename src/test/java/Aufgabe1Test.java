import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.hm.cs.bka.hmkara.Kara;
import edu.hm.cs.bka.hmkara.test.TestKaraController;
import edu.hm.cs.bka.hmkara.world.World;

public class Aufgabe1Test {

	@Test
	public void runs() {
		World begin = new World("world_b.txt");		
		TestKaraController t = new TestKaraController(begin);
		Kara.setController(t);
		AufgabeMissionImpossible.main(new String[0]);
		World expected = new World("world_b_solved.txt");
		Assertions.assertEquals("\n"+begin.asString(), "\n"+expected.asString(), "Kara hat die Aufgabe nicht gelöst!");	
	}

}
