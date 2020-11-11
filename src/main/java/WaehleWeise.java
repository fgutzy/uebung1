import static edu.hm.cs.bka.karalight.Kara.*;

/**
 * Hauptprogramm. Hier können Sie Kara programmieren.
 */
public class WaehleWeise {

  /**
   * Main-Methode. Hier können Sie Java programmieren und dabei die folgenden Kara-Befehle direkt
   * verwenden:
   * <ul>
   *   <li>move() - Kara bewegt sich einen Schritt nach vorn.</li>
   *   <li>turnRight() bzw. turnLeft() - Kara dreht sich nach rechts bzw. links</li>
   *   <li>pickLeaf() - Kara nimmt ein Blatt auf (geht nur, wenn eins da ist!)</li>
   *   <li>putLeaf() - Kara legt ein Blatt ab (geht nur, wenn keins da ist!)</li>
   * </ul>
   * Zusätzlich stehen Ihnen die folgenden Abfragen zur Verfügung:
   * <ul>
   *   <li>isMushroomInFront() - liefert WAHR, wenn vor Kara ein Pilz steht</li>
   *   <li>isTreeInFront() - liefert WAHR, wenn vor Kara ein Baum steht</li>
   *   <li>isTreeLeft() - liefert WAHR, wenn links von Kara ein Baum steht</li>
   *   <li>isTreeRight() - liefert WAHR, wenn rechts von Kara ein Baum steht</li>
   *   <li>isOnLeaf() - liefert WAHR, wenn Kara auf einem Blatt steht</li>
   * </ul>
   *
   * @param args not used.
   */
  public static void main(String[] args) {
    boolean oben = false;
    boolean unten = false;

    turnLeft();
    move();
    turnLeft();

    if (isTreeInFront()) {
      oben = true;
    }
    if (!isTreeInFront()) {
      unten = true;
    }

    if (oben) {
      turnLeft();
      move();
      move();
      turnLeft();
      move();
      move();
      turnLeft();
      move();
      move();
      turnRight();
      move();
      pickLeaf();
    }

    if (unten) {
      turnRight();
      turnRight();
      move();
      move();
      turnRight();
      move();
      move();
      turnLeft();
      move();
      pickLeaf();


    }
  }
}
