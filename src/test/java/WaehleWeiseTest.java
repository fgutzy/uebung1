import edu.hm.cs.bka.karalight.world.RepresentationMode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.hm.cs.bka.karalight.Kara;
import edu.hm.cs.bka.karalight.test.TestKaraController;
import edu.hm.cs.bka.karalight.world.World;

public class WaehleWeiseTest {

  @Test
  public void blattObenTest() {
    // arrange
    World begin = new World("BlattOben.world");
    Kara.setController(new TestKaraController(begin));

    // act
    WaehleWeise.main(new String[0]);

    // assert
    World expected = new World("BlattObenExpected.world");
    // ignores Kara's position!
    Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
        "\n" + begin.getRepresentation(RepresentationMode.NONE),
        "Kara hat die Aufgabe nicht gelöst!");
  }

  @Test
  public void blattUntenTest() {
    // arrange
    World begin = new World("BlattUnten.world");
    Kara.setController(new TestKaraController(begin));

    // act
    WaehleWeise.main(new String[0]);

    // assert
    World expected = new World("BlattUntenExpected.world");
    // ignores Kara's position!
    Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
        "\n" + begin.getRepresentation(RepresentationMode.NONE),
        "Kara hat die Aufgabe nicht gelöst!");
  }

}
