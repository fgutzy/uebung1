import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.hm.cs.bka.karalight.Kara;
import edu.hm.cs.bka.karalight.test.TestKaraController;
import edu.hm.cs.bka.karalight.world.World;

public class BeispielTest {

	@Test
	public void checkResultWithout() {
		// arrange
		World begin = new World("world_b.txt");
		Kara.setController(new TestKaraController(begin));

		// act
		BeispielProgramm.main(new String[0]);

		// assert
		World expected = new World("world_b_solved.txt");
		// ignores Kara's position!
		Assertions.assertEquals("\n" + expected.asString(), "\n" + begin.asString(),
				"Kara hat die Aufgabe nicht gelöst!");

	}

}
