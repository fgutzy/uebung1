import edu.hm.cs.bka.karalight.Kara;
import edu.hm.cs.bka.karalight.test.TestKaraController;
import edu.hm.cs.bka.karalight.world.RepresentationMode;
import edu.hm.cs.bka.karalight.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RahmenZeichnenTest {

  @Test
  public void zeichnet3x3Rahmen() {
    // arrange
    World begin = new World("3x3.world");
    Kara.setController(new TestKaraController(begin));

    // act
    RahmenZeichnen.main(new String[0]);

    // assert
    World expected = new World("3x3Expected.world");
    // ignores Kara's position!
    Assertions.assertEquals(expected.getRepresentation(RepresentationMode.NONE),
        begin.getRepresentation(RepresentationMode.NONE),
        "Kara hat die Aufgabe nicht gelöst!");
  }


  @Test
  public void zeichnet5x6Rahmen() {
    // arrange
    World begin = new World("5x6.world");
    Kara.setController(new TestKaraController(begin));

    // act
    RahmenZeichnen.main(new String[0]);

    // assert
    World expected = new World("5x6Expected.world");
    // ignores Kara's position!
    Assertions.assertEquals(expected.getRepresentation(RepresentationMode.NONE),
        begin.getRepresentation(RepresentationMode.NONE),
        "Kara hat die Aufgabe nicht gelöst!");
  }
}
