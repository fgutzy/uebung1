import edu.hm.cs.bka.karalight.Kara;
import edu.hm.cs.bka.karalight.test.TestKaraController;
import edu.hm.cs.bka.karalight.world.RepresentationMode;
import edu.hm.cs.bka.karalight.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ErnteUndAussaatTest {

  @Test
  public void loeseTypischeWelt() {
    // arrange
    World begin = new World("EinfachExpected.world");
    Kara.setController(new TestKaraController(begin));

    // act
    ErnteUndAussaat.main(new String[0]);

    // assert
    World expected = new World("EinfachExpected.world");
    // ignores Kara's position!
    Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
        "\n" + begin.getRepresentation(RepresentationMode.NONE),
        "Kara hat die Aufgabe nicht gelöst!");
  }


  @Test
  public void loeseMittigeWelt() {
    // arrange
    World begin = new World("MittigExpected.world");
    Kara.setController(new TestKaraController(begin));

    // act
    ErnteUndAussaat.main(new String[0]);

    // assert
    World expected = new World("MittigExpected.world");
    // ignores Kara's position!
    Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
        "\n" + begin.getRepresentation(RepresentationMode.NONE),
        "Kara hat die Aufgabe nicht gelöst!");
  }

  @Test
  public void loeseUmgekehrteWelt() {
    // arrange
    World begin = new World("ReverseExpected.world");
    Kara.setController(new TestKaraController(begin));

    // act
    ErnteUndAussaat.main(new String[0]);

    // assert
    World expected = new World("ReverseExpected.world");
    // ignores Kara's position!
    Assertions.assertEquals("\n" + expected.getRepresentation(RepresentationMode.NONE),
        "\n" + begin.getRepresentation(RepresentationMode.NONE),
        "Kara hat die Aufgabe nicht gelöst!");
  }
}
