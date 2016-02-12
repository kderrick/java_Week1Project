import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class WordPuzzleTest {
  @Test
  public void vowelRemover_RemoveAllAsFromString_lowercase() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String letterARemoved = "h-t";
    assertEquals(letterARemoved, testWordPuzzle.vowelRemover("hat"));
  }
  @Test
  public void vowelRemover_RemoveAllEsFromString_lowercase() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String letterARemoved = "h--l";
    assertEquals(letterARemoved, testWordPuzzle.vowelRemover("heel"));
  }
}
