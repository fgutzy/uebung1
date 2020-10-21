import edu.hm.cs.bka.karalight.Kara;
import edu.hm.cs.bka.karalight.test.TestKaraController;
import edu.hm.cs.bka.karalight.world.RepresentationMode;
import edu.hm.cs.bka.karalight.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InDieReiheTest {

  @Test
  public void loestVariante1() {
    // arrange
    World begin = new World("InDieReihe1.world");
    Kara.setController(new TestKaraController(begin));

    // act
    InDieReihe.main(new String[0]);

    // assert
    World expected = new World("InDieReihe1Expected.world");
    // ignores Kara's position!
    Assertions.assertEquals(System.lineSeparator()+expected.getRepresentation(RepresentationMode.NONE),
        System.lineSeparator()+begin.getRepresentation(RepresentationMode.NONE),
        "Kara hat die Aufgabe nicht gelöst!");
  }

  @Test
  public void loestVariante2() {
    // arrange
    World begin = new World("InDieReihe2.world");
    Kara.setController(new TestKaraController(begin));

    // act
    InDieReihe.main(new String[0]);

    // assert
    World expected = new World("InDieReihe2Expected.world");
    // ignores Kara's position!
    Assertions.assertEquals(System.lineSeparator()+expected.getRepresentation(RepresentationMode.NONE),
        System.lineSeparator()+begin.getRepresentation(RepresentationMode.NONE),
        "Kara hat die Aufgabe nicht gelöst!");
  }
}
