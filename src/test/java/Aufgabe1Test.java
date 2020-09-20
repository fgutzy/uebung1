import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.hm.cs.bka.hmkara.Kara;
import edu.hm.cs.bka.hmkara.test.TestKaraController;
import edu.hm.cs.bka.hmkara.world.World;

public class Aufgabe1Test {

	@Test
	public void runs() {
		// arrange
		World begin = new World("world_b.txt");
		Kara.setController(new TestKaraController(begin));

		// act
		Aufgabe.main(new String[0]);

		// assert
		World expected = new World("world_b_solved.txt");
		Assertions.assertEquals("\n" + begin.asString(), "\n" + expected.asString(),
				"Kara hat die Aufgabe nicht gelöst!");
	}

}
