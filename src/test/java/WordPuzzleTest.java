import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class WordPuzzleTest {
  @Test
  public void vowelRemover_RemoveAllAsFromString() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String letterARemoved = "h-t";
    assertEquals(letterARemoved, testWordPuzzle.vowelRemover("hat"));
  }
}
